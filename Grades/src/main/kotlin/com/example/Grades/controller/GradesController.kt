package com.example.Grades.controller

import com.example.Grades.model.Grades
import com.example.Grades.service.GradesService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/grades")
class GradesController (private val service: GradesService) {

    @GetMapping
    fun getAllGrades(): List<Grades> {
        return service.getAllGrades()
    }

    @GetMapping("/{id}")
    fun getGradesById(@PathVariable id: Long): Grades {
        return service.getGradesById(id)
    }

    @PostMapping
    fun createGrades(@RequestBody grades: Grades): Grades {
        return service.createGrades(grades)
    }

    @PutMapping("/{id}")
    fun updateGrades(@PathVariable id: Long, @RequestBody updatedGrades: Grades): Grades {
        return service.updateGrades(id, updatedGrades)
    }

    @DeleteMapping("/{id}")
    fun deleteGrades(@PathVariable id: Long) {
        service.deleteGrades(id)
    }
}