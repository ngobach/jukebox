package com.ngobach.jukebox.web

import io.ktor.application.*
import io.ktor.features.AutoHeadResponse
import io.ktor.features.Compression
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.jetty.Jetty
import kotlinx.coroutines.*


fun Application.module() {
    install(AutoHeadResponse)
    install(Compression)
    install(ContentNegotiation) {
        jackson()
    }
    routing {
        withApi()
        withDefaultHandlers()
    }
}

fun CoroutineScope.start() {
    launch {
        embeddedServer(Jetty, port = 8080, module = Application::module).start(false)
    }
}