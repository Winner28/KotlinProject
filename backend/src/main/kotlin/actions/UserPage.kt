package actions

import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get
import model.User

fun Route.userPage() {
    get("/user/id") {
        call.respond(User(1, "John").toString())
    }
}