package moe.ganen.jikankt

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.junit.Assert

import moe.ganen.jikankt.models.user.User

class UserTest {
    @Test
    fun GetUserTest() {
        runBlocking {
            val username: String = "weiluntong"
            val user: User = JikanKt.getUser(username)
            Assert.assertEquals(username, user.username)
        }
    }
}