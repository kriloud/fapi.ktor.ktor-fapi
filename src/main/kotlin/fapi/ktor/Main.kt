package fapi.ktor

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import fapi.ktor.plugins.*

fun main() {
    embeddedServer(Netty, port = 2096, host = "0.0.0.0") {
        configureRouting()
    }.start(wait = true)
}
