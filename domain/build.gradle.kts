repositories {
    mavenCentral()
}

plugins {
    kotlin("jvm")
}

dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.1")
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
}