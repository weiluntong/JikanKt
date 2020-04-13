package moe.ganen.jikankt

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import moe.ganen.jikankt.models.base.Entity

import org.junit.Test

class ExampleTest {
    @Test
    fun simpleTest() {
        runBlocking {
            val clientTest: Entity = JikanKt.getMagazine(1, 1)
            println(clientTest)
            delay(5000)
        }
    }
}