package com.ngobach.jukebox.web

import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respondText
import io.ktor.routing.Route

fun Route.withDefaultHandlers() {
    handle {
        call.respondText("Not found", status = HttpStatusCode.NotFound)
    }
}