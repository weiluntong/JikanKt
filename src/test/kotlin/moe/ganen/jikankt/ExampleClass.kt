package moe.ganen.jikankt

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import moe.ganen.jikankt.models.base.Entity

fun main() {
    runBlocking {
        val clientTest: Entity = JikanKt.getSeasonLater()
        println(clientTest)
        delay(5000)
    }
}