package com.ngobach.jukebox

import com.ngobach.jukebox.web.start
import org.slf4j.Logger
import org.slf4j.LoggerFactory

val logger: Logger = LoggerFactory.getLogger("Main")

fun main() {
    println("Port = ${AppConfig[AppSpec.port]}")
    start()
    logger.info("Web server is started")
}