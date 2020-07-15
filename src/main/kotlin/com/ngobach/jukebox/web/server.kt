package com.ngobach.jukebox.web

import com.ngobach.jukebox.AppConfig
import com.ngobach.jukebox.AppSpec
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.AutoHeadResponse
import io.ktor.features.Compression
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

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

fun start() {
    embeddedServer(
        Netty,
        host = AppConfig[AppSpec.host],
        port = AppConfig[AppSpec.port],
        module = Application::module
    ).start(false)
}