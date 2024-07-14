package com.example.Grades.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "student-ms")
interface StudentClient {
    @GetMapping("/students/{id}")
    fun getStudentById(@PathVariable("id") id: Long): Student
}