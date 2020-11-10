package com.example.controller

import com.example.domain.Author
import com.example.repository.AuthorRepository
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import java.util.*
import javax.validation.Valid

@Controller("/author")
open class AuthorController(private val repository: AuthorRepository) {

    @Post("/")
    open fun register(@Body @Valid author: Author): Author = repository.save(author)

    @Get("/")
    open fun getAll(): List<Author> = repository.findAll().toList()

    @Get("/{id}")
    open fun getById(@QueryValue id: UUID) = repository.findById(id)

    @Delete("/{id}")
    open fun delete(id: UUID) {
        repository.deleteById(id)
    }

    @Put("/{id}")
    open fun edit(id: UUID, @Body @Valid author: Author): Author{
        return repository.findById(id).get().copy(
                name = author.name,
                email = author.email,
                password = author.password,
                refreshToken = author.refreshToken,
        ).let {
            repository.update(it)
        }
    }
}