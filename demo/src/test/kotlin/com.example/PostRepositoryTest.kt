package com.example

import io.micronaut.test.annotation.MicronautTest
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class PostRepositoryTest {
    @Inject
    lateinit var repository: PostRepository

    @Test
    fun `testing test`() {
        val posts = Posts(id = 1, title = "testing PostRepository", body = "ini cuman test aja kok")
        repository.save(posts)

        assert(repository.findByTitle(posts.title) == posts)
    }

//    @MockBean(PostRepository::class)
//    fun repository(): PostRepository{
//        return mock
//    }
}