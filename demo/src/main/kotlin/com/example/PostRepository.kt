package com.example

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository

@Repository
interface PostRepository : CrudRepository<Posts, Long> {
    fun findByTitle(title: String): Posts
}