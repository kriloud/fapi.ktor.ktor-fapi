val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
    application
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.serialization").version("1.6.21")
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "fapi.ktor"
version = "0.0.2"
application {
    mainClass.set("fapi.ktor.MainKt")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:$ktor_version")
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("ch.qos.logback:logback-classic:$logback_version")
    testImplementation("io.ktor:ktor-server-tests:$ktor_version")
    implementation("io.ktor:ktor-html-builder:$ktor_version")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "fapi.ktor.MainKt"
    }
}