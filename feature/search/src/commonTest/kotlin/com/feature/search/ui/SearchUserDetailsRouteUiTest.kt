package com.feature.search.ui

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.v2.runComposeUiTest
import androidx.compose.ui.test.waitUntilAtLeastOneExists
import com.feature.search.di.searchModule
import com.feature.search.sources.SearchRepository
import com.feature.search.util.createMockUser
import dev.mokkery.answering.returns
import dev.mokkery.answering.throws
import dev.mokkery.everySuspend
import dev.mokkery.matcher.any
import dev.mokkery.mock
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module
import org.koin.test.KoinTest
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test

@OptIn(ExperimentalTestApi::class)
class SearchUserDetailsRouteUiTest : KoinTest {

    private val repository = mock<SearchRepository>()

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
        stopKoin()
    }

    @Test
    fun `search user details route shows user information on success`() = runComposeUiTest {
        val userDetails = createMockUser(
            name = "John Doe",
            location = "London",
            aboutMe = "Bio"
        )

        everySuspend { repository.getUser(any()) } returns userDetails

        setContent {
            SearchUserDetailsRoute(userId = "1")
        }

        mainClock.advanceTimeBy(1_000)

        waitUntilAtLeastOneExists(hasText("John Doe"), 6_000)
        onNodeWithText("John Doe").assertIsDisplayed()
    }

    @Test
    fun `search user details route shows error state`() = runComposeUiTest {
        everySuspend { repository.getUser(any()) } throws Exception("Failed")

        setContent {
            SearchUserDetailsRoute(userId = "1")
        }

        mainClock.advanceTimeBy(1_000)

        onNodeWithText("Select a User", substring = true).assertIsDisplayed()
    }
}
