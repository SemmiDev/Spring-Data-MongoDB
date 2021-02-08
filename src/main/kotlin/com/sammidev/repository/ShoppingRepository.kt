package com.sammidev.repository

import com.sammidev.entity.Shopping
import org.springframework.data.mongodb.repository.MongoRepository

interface ShoppingRepository : MongoRepository<Shopping, String>