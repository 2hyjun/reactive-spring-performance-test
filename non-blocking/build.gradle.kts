
plugins {
    id("org.springframework.boot")

    kotlin("jvm")
    kotlin("plugin.spring")
}


dependencies {
    implementation(project(":domain"))
    implementation(kotlin("reflect"))
    implementation(kotlin("stdlib-jdk8"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.4.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2")
    implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.liquibase:liquibase-core:4.0.0")
    runtimeOnly("org.postgresql:postgresql")
    runtimeOnly("io.r2dbc:r2dbc-postgresql")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}