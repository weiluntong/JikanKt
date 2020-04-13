package moe.ganen.jikankt

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test

import moe.ganen.jikankt.models.user.User

class UserTest {
    @Test
    fun GetUserTest() {
        runBlocking {
            val user: User = JikanKt.getUser("weiluntong")
        }
    }
}