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
            var expectedResult: User = User(userId = 1311859, username = "weiluntong", url = "https://myanimelist.net/profile/weiluntong")

            var actualResult: User = JikanKt.getUser(expectedResult.username)

            Assert.assertEquals(expectedResult.userId, actualResult.userId)
            Assert.assertEquals(expectedResult.username, actualResult.username)
            Assert.assertEquals(expectedResult.url, actualResult.url)
        }
    }
}