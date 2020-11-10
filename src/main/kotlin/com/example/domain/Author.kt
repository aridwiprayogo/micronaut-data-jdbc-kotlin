package com.example.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.MappedEntity
import java.util.*
import javax.persistence.*

@MappedEntity
@Introspected
@Entity
data class Author(
        @Id
        @GeneratedValue
        @JsonIgnore
        var id: UUID? = UUID.randomUUID(),
        val name: String="",
        val email: String="",
        val password: String="",
        val refreshToken: String="",
)
