package com.ngobach.jukebox

import com.ngobach.jukebox.web.start
import org.slf4j.Logger
import org.slf4j.LoggerFactory

val PackageName = ::main.javaClass.packageName ?: "jukebox"
val AppLogger: Logger = LoggerFactory.getLogger(PackageName)

fun main() {
    start()
    AppLogger.info("Web server is started")
}