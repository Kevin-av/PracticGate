package com.example.Grades.model

import jakarta.persistence.*

@Entity
@Table (name = "grades")
data class Grades (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val subject: String? = null,
    val grade: Int? = null,

    @Column(name = "student_id")
    val studentId: Long? = null
)