package com.example.Students

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class StudentsApplication

fun main(args: Array<String>) {
	runApplication<StudentsApplication>(*args)
}
