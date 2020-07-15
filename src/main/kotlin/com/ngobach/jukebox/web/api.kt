package com.ngobach.jukebox.web

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.withApi() {
    get("/") {
        call.respondText("Jukebox")
    }
    get("/status") {
        call.respond(mapOf(
            "status" to "OK"
        ))
    }
}