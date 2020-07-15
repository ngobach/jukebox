package com.ngobach.jukebox

import com.uchuhimo.konf.Config
import com.uchuhimo.konf.ConfigSpec
import com.uchuhimo.konf.source.yaml

object AppSpec : ConfigSpec("jukebox") {
    val host by optional<String>("0.0.0.0", "host")
    val port by required<Int>("port")
}

val AppConfig = Config { addSpec(AppSpec) }
    .from.yaml.resource("application.yaml")
    .from.yaml.file("application.yaml", true)