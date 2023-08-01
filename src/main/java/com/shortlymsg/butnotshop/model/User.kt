package com.shortlymsg.butnotshop.model

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.GenericGenerator

data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    val userId: String,
    var email: String,
    var password: String,
    var phoneNumber: String,
    val createdAt: String,
    var updatedAt: String
)
