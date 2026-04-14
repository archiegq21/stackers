package com.feature.home.ui

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.v2.runComposeUiTest
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
class UserDetailsRouteUiTest : KoinTest {

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
    fun `user details route shows user information when data is available`() = runComposeUiTest {
        val user = createMockUser(
            name = "John Doe",
            reputation = 1000,
            location = "London",
            aboutMe = "Bio"
        )
        every { repository.getUser(any()) } returns flowOf(user)

        setContent {
            UserDetailsRoute(userId = "1")
        }

        onNodeWithText("John Doe").assertIsDisplayed()
    }

    @Test
    fun `user details route fails to get user`() = runComposeUiTest {
        every { repository.getUser(any()) } returns flowOf()

        setContent {
            UserDetailsRoute(userId = "1")
        }

        onNodeWithText("John Doe").assertDoesNotExist()
    }
}
