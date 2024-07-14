package com.example.Grades.controller

import com.example.Grades.model.Grades
import com.example.Grades.service.GradesService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/grades")
class GradesController(private val service: GradesService) {

    @GetMapping
    fun getAllGrades(): List<Grades> {
        return service.getAllGrades()
    }

    @GetMapping("/{id}")
    fun getGradesById(@PathVariable id: Long): ResponseEntity<Grades> {
        val grades = service.getGradesById(id)
        return ResponseEntity.ok(grades)
    }

    @PostMapping
    fun createGrades(@RequestBody grades: Grades): ResponseEntity<Grades> {
        val createdGrades = service.createGrades(grades)
        return ResponseEntity.status(HttpStatus.CREATED).body(createdGrades)
    }

    @PutMapping("/{id}")
    fun updateGrades(@PathVariable id: Long, @RequestBody updatedGrades: Grades): ResponseEntity<Grades> {
        val updated = service.updateGrades(id, updatedGrades)
        return ResponseEntity.ok(updated)
    }

    @DeleteMapping("/{id}")
    fun deleteGrades(@PathVariable id: Long): ResponseEntity<Unit> {
        service.deleteGrades(id)
        return ResponseEntity.noContent().build()
    }
}
