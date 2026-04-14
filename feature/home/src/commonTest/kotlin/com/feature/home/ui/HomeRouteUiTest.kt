package com.feature.home.ui

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.v2.runComposeUiTest
import androidx.paging.LoadState
import androidx.paging.LoadStates
import androidx.paging.PagingData
import com.core.user.sources.UserRepository
import com.feature.home.di.homeModule
import com.feature.home.util.createMockUser
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
class HomeRouteUiTest : KoinTest {

    private val repository = mock<UserRepository>()

    @BeforeTest
    fun setup() {
        startKoin {
            modules(
                homeModule,
                module {
                    single<UserRepository> {
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
    fun `home route shows user cards when data is available`() = runComposeUiTest {
        val users = listOf(
            createMockUser(id = "1", name = "John Doe"),
            createMockUser(id = "2", name = "Jane Smith")
        )

        every {
            repository.getStoredPagedUser(any(), any(), any())
        } returns flowOf(PagingData.from(users))

        setContent {
            HomeRoute(
                onUserClick = {}
            )
        }

        onNodeWithText("John Doe").assertIsDisplayed()
        onNodeWithText("Jane Smith").assertIsDisplayed()
    }

    @Test
    fun `home route has no user cards when data is empty`() = runComposeUiTest {
        every {
            repository.getStoredPagedUser(any(), any(), any())
        } returns flowOf(PagingData.empty(
            sourceLoadStates = LoadStates(
                refresh = LoadState.NotLoading(true),
                prepend = LoadState.NotLoading(true),
                append = LoadState.NotLoading(true),
            ),
            mediatorLoadStates = LoadStates(
                refresh = LoadState.NotLoading(true),
                prepend = LoadState.NotLoading(true),
                append = LoadState.NotLoading(true),
            ),
        ))

        setContent {
            HomeRoute(
                onUserClick = {}
            )
        }

        onNodeWithText("John Doe").assertDoesNotExist()
    }

}
