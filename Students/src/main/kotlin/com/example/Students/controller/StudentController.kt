package com.example.Students.controller

import com.example.Students.model.Student
import com.example.Students.service.StudentService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/students")
class StudentController(private val service: StudentService) {
    @GetMapping
    fun getAllStudents(): List<Student> {
        return service.getAllStudents()
    }

    @GetMapping("/{id}")
    fun getStudentById(@PathVariable id: Long): Student {
        return service.getStudentById(id)
    }

    @PostMapping
    fun createStudent(@RequestBody student: Student): Student {
        return service.createStudent(student)
    }

    @PutMapping("/{id}")
    fun updateStudent(@PathVariable id: Long, @RequestBody updatedStudent: Student): Student {
        return service.updateStudent(id, updatedStudent)
    }

    @DeleteMapping("/{id}")
    fun deleteStudent(@PathVariable id: Long) {
        service.deleteStudent(id)
    }

}