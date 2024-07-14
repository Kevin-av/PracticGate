package com.example.Grades

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient


@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = ["com.example.Grades.client"])
class GradesApplication

fun main(args: Array<String>) {
	runApplication<GradesApplication>(*args)
}
