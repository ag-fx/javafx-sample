import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    application
    kotlin("jvm")
    id("org.openjfx.javafxplugin") version "0.0.8"
}

application {
    mainClassName = "com.github.bschramke.jfxsample.ApplicationKt"
    applicationDefaultJvmArgs = listOf(
            "--add-opens=javafx.graphics/javafx.scene=ALL-UNNAMED"
    )
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

javafx {
    version = "14"
    modules = listOf("javafx.controls", "javafx.graphics")
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    implementation("no.tornado:tornadofx:1.7.17")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
