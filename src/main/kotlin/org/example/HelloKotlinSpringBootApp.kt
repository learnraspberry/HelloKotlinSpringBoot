package org.example;

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class HelloKotlinSpringBootApp

fun main(args: Array<String>) {
    SpringApplication.run(HelloKotlinSpringBootApp::class.java, *args)
}