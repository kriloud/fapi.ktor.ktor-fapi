package fapi.ktor.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.html.*
import kotlinx.html.*


fun Application.configureRouting() {
val OK = "204"
    // Starting point for a Ktor app:
    routing {
        get("/") {
            call.respondText("Hello World! Fapi 0.0.2")
        }
    }
    routing {
        get("/info") {
            call.respondText("Kotlin 1.6.21\nKtor 1.6.21")
        }
    }
    routing {
        get("/help") {
            call.respondText("/\n/info\n/help\n/text\n/user\n/test\n")
        }
    }
    routing {
        get("/text") {
            call.respondText("<h1>foo</h1> <h2>foo</h2>",ContentType.Text.Html)

        }
    }
    routing {
        get("/user"){
            call.respondText("User_id:1,2,3,4,5")
        }
    }
    routing {
        get("/user/1"){
            call.respondText("[\n {\n  id: 1\n  username: finderfailoff\n  status: dev\n  key_type: LEGACY\n  suspend: indefinite\n }\n]")
        }
    }
    routing {
        get("/user/2"){
            call.respondText("[\n {\n  id: 2\n  username: xtrafrancyz\n  status: dev\n  key_type: NEW\n  suspend: 30d\n }\n]")
        }
    }
    routing {
        get("/user/3"){
            call.respondText("[\n {\n  id: 3\n  username: ponychan\n  status: partner\n  key_type: NEW\n  suspend: indefinite\n }\n]")
        }
    }
    routing {
        get("/user/4"){
            call.respondText("[\n {\n  id: 4\n  username: viskontin\n  status: \n  key_type: NEW\n  suspend: \n }\n]")
        }
    }
    routing {
        get("/user/5"){
            call.respondText("[\n {\n  id: 5\n  username: TGW\n  status: dev\n  key_type: NEW\n  suspend: \n }\n]")
        }
    }
    routing {
        get("/test"){
            call.respondText(OK)
        }
    }
    routing {
        get("/html") {
            val name = "Fapi v 0.0.3"
            call.respondHtml(HttpStatusCode.OK) {
                head {
                    title {
                        +name
                    }
                }
                body {
                    h1 {
                        +"Hello from $name!"
                    }
                    div {
                        +"Created by finderfailoff!"
                    }
                    div {
                        +"REST API on Kotlin (Ktor) with Frontend HTML."
                        +" I small know HTML and frontend languages in general."
                    }
                    div {
                        +" I specifically added html to my api server to make a help page because the one that is now difficult to find (it is not the main page!)"
                    }
                    h2 {
                        +"I am a backend developer and my main goal is to make a good api! Not good UI "
                    }
                }
            }
        }
    }
}
