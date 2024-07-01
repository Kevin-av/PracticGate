package com.example.Grades.service

import com.example.Grades.model.Grades
import com.example.Grades.repository.GradesRepository
import org.springframework.stereotype.Service

@Service
class GradesService(private val repository: GradesRepository) {
    fun getAllGrades(): List<Grades> {
        return repository.findAll()
    }

    fun getGradesById(id: Long): Grades {
        return repository.findById(id).orElseThrow {
            RuntimeException("Grades not found")
        }
    }

    fun createGrades(grades: Grades): Grades {
        return repository.save(grades)
    }

    fun updateGrades(id: Long, updatedGrades: Grades): Grades {
        val existingGrades = repository.findById(id).orElseThrow {
            RuntimeException("Grades not found")
        }

        // Actualizar campos según sea necesario
        /*existingGrades.subject = updatedGrades.subject
        existingGrades.grade = updatedGrades.grade
        existingGrades.studentId = updatedGrades.studentId*/

        return repository.save(existingGrades)
    }

    fun deleteGrades(id: Long) {
        repository.deleteById(id)
    }
}