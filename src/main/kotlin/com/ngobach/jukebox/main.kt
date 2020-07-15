package com.ngobach.jukebox

import com.ngobach.jukebox.web.start
import kotlinx.coroutines.coroutineScope

suspend fun main() {
    coroutineScope {
        start()
        println("Hey")
    }
}