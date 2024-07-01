package com.example.Students.model

import jakarta.persistence.*

@Entity
@Table (name = "student")
data class Student (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String? = null,
    val email: String? = null,
    val age: Int? = null
)