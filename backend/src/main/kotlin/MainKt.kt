import actions.userPage
import io.ktor.application.*
import io.ktor.features.ContentNegotiation
import io.ktor.features.DefaultHeaders

import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) {
    embeddedServer(Netty, port = 8000, module = Application::main)
            .start()
}

fun Application.main() {
    install(DefaultHeaders)
    routing {
        userPage()
    }
}