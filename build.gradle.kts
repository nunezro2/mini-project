// import io.gitlab.arturbosch.detekt.Detekt

plugins {
    kotlin("jvm") version "2.0.20"
    kotlin("plugin.serialization") version "2.0.20" // serialization
    // id("io.github.usefulness.ktlint-gradle-plugin") version "0.10.0" // kotlin lint
    // id("io.gitlab.arturbosch.detekt") version ("1.23.7") // kotlin lint}
}

group = "hackl.projekt"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

application {
  // Define the main class for the application.
    mainClass = 'hackl.projekt.Main'
}

dependencies {
    implementation(project.dependencies.platform("io.insert-koin:koin-bom:4.1.0-Beta1")) // DI
    listOf(
        "io.insert-koin:koin-core", // DI
        "org.jetbrains.kotlinx:kotlinx-serialization-json:1.7.3", // serialization
        "com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.15.2",
        "com.fasterxml.jackson.module:jackson-module-kotlin:2.15.2",
        "io.github.oshai:kotlin-logging-jvm:7.0.0", // logging
        "ch.qos.logback:logback-classic:1.5.6", // logging
    ).forEach(::implementation)
    listOf(
        "io.insert-koin:koin-test:4.1.0-Beta1", // DI
        "io.insert-koin:koin-test-junit5:4.1.0-Beta1", // DI && junit5
        "org.junit.jupiter:junit-jupiter-api:5.8.1", // junit5
        "org.junit.jupiter:junit-jupiter-engine:5.8.1",
        "org.jetbrains.kotlin:kotlin-test",
    ).forEach(::testImplementation)
    // detektPlugins("io.gitlab.arturbosch.detekt:detekt-formatting:1.23.7") // kotlin lint}
}

tasks {
    test {
        useJUnitPlatform()
    }

    // withType<Detekt> {
    //     reports {
    //         html.required.set(true)
    //         txt.required.set(true)
    //     }
    // }
}



kotlin {
    jvmToolchain(21)
}