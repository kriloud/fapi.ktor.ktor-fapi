package fapi.ktor

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import fapi.ktor.plugins.*

fun main() {
    embeddedServer(Netty, port = 8100, host = "localhost") {
        configureRouting()
    }.start(wait = true)
}
