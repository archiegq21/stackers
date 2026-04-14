package com.feature.search.ui

import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.clearText
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.v2.runComposeUiTest
import androidx.compose.ui.test.waitUntilAtLeastOneExists
import androidx.paging.PagingData
import com.core.designsystem.decorator.LocalSearchBarTextFieldState
import com.feature.search.di.searchModule
import com.feature.search.sources.SearchRepository
import com.feature.search.util.createMockUser
import dev.mokkery.answering.returns
import dev.mokkery.every
import dev.mokkery.matcher.any
import dev.mokkery.mock
import kotlinx.coroutines.flow.flowOf
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import org.koin.test.KoinTest
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test

@OptIn(ExperimentalTestApi::class)
class SearchRouteUiTest : KoinTest {

    private val repository = mock<SearchRepository>()

    private val textField = TextFieldState("")

    @BeforeTest
    fun setup() {
        startKoin {
            modules(
                searchModule,
                module {
                    single<SearchRepository> {
                        repository
                    }
                }
            )
        }
    }

    @AfterTest
    fun tearDown() {
        textField.clearText()
        stopKoin()
    }

    @Test
    fun `search route shows user cards when data is available`() = runComposeUiTest {
        val users = listOf(
            createMockUser(id = "1", name = "John Doe"),
            createMockUser(id = "2", name = "Jane Smith")
        )

        every {
            repository.getSearchPagedUser(any(), any(), any())
        } returns flowOf(PagingData.from(users))

        setContent {
            CompositionLocalProvider(LocalSearchBarTextFieldState provides textField) {
                SearchRoute(
                    onUserClick = {}
                )
            }
        }

        mainClock.advanceTimeBy(1001)

        onNodeWithText("Looks like we don't have users...", substring = true).assertIsDisplayed()

        textField.edit {
            append("will return some users")
        }

        mainClock.advanceTimeBy(1001)

        waitUntilAtLeastOneExists(hasText("John Doe"), 6_000)
        onNodeWithText("John Doe").assertIsDisplayed()
        onNodeWithText("Jane Smith").assertIsDisplayed()
    }

    @Test
    fun `search route shows empty state when no data`() = runComposeUiTest {
        every {
            repository.getSearchPagedUser(any(), any(), any())
        } returns flowOf(PagingData.empty())

        setContent {
            CompositionLocalProvider(LocalSearchBarTextFieldState provides textField) {
                SearchRoute(
                    onUserClick = {}
                )
            }
        }

        mainClock.advanceTimeBy(1001)

        onNodeWithText("Looks like we don't have users...", substring = true).assertIsDisplayed()

        textField.edit {
            append("will return empty users")
        }

        mainClock.advanceTimeBy(1001)

        onNodeWithText("Looks like we don't have users...", substring = true).assertIsDisplayed()
    }
}
