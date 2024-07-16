package com.example.Grades.controller

import com.example.Grades.client.Student
import com.example.Grades.service.GradesService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/grades/student")
class GradesStudentController(private val gradesService: GradesService) {
    @GetMapping
    fun getAllStudents(): ResponseEntity<List<Student>> {
        val students = gradesService.getAllStudents()
        return ResponseEntity.ok(students)
    }

    @PostMapping
    fun createStudent(@RequestBody student: Student): ResponseEntity<Student> {
        val createdStudent = gradesService.createStudent(student)
        return ResponseEntity.ok(createdStudent)
    }
}