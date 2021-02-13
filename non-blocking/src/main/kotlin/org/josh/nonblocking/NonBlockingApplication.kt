package org.josh.nonblocking

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NonBlockingApplication

fun main(args: Array<String>) {
    runApplication<NonBlockingApplication>(*args)
}