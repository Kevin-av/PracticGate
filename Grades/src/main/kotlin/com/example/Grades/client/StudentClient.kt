package com.example.Grades.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FeignClient(name = "student-ms")
interface StudentClient {
    @GetMapping("/students")
    fun getAllStudents(): List<Student>

    @PostMapping("/students")
    fun createStudent(@RequestBody student: Student): Student
}