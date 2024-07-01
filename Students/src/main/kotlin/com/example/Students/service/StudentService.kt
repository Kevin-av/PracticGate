package com.example.Students.service

import com.example.Students.model.Student
import com.example.Students.repository.StudentRepository
import org.springframework.stereotype.Service

@Service

class StudentService(private val repository: StudentRepository) {
    fun getAllStudents(): List<Student> {
        return repository.findAll()
    }

    fun getStudentById(id: Long): Student {
        return repository.findById(id).orElseThrow {
            RuntimeException("Student not found")
        }
    }

    fun createStudent(student: Student): Student {
        return repository.save(student)
    }

    fun updateStudent(id: Long, updatedStudent: Student): Student {
        val existingStudent = repository.findById(id).orElseThrow { RuntimeException("Student not found")
        }
        /*existingStudent.name = updatedStudent.name
        existingStudent.email = updatedStudent.email
        existingStudent.age = updatedStudent.age*/

        return repository.save(existingStudent)
    }

    fun deleteStudent(id: Long) {
        repository.deleteById(id)
    }
}