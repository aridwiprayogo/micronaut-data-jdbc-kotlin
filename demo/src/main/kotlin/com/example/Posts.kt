package com.example

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Posts(
        @Id @GeneratedValue var id: Long = - 1,
        var title: String = "",
        var body: String = "",
)
