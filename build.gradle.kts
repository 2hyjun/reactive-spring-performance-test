import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    id("org.springframework.boot") version "2.4.2" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false

    kotlin("jvm") version "1.4.21" apply false
    kotlin("plugin.spring") version "1.4.21" apply false
    kotlin("plugin.jpa") version "1.4.21" apply false

    id("org.jlleitschuh.gradle.ktlint") version "9.4.1"
    id("org.jlleitschuh.gradle.ktlint-idea") version "9.4.1"
}

allprojects {
    group = "org.josh"
    version = "1.0-SNAPSHOT"

    tasks.withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
            incremental = false
        }
    }
}

subprojects {
    repositories {
        mavenCentral()
    }

    apply {
        plugin("io.spring.dependency-management")
    }


}

ktlint {
    version.set("0.40.0")
}
