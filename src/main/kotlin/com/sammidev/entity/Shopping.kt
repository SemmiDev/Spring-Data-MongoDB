package com.sammidev.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.math.BigDecimal

@Document("shopping")
data class Shopping (
        @Id
        val id: String?,

        @field:Field("name")
        @Indexed(unique = true)
        var shoppingName: String,

        @Field("category")
        var shoppingCategory: ShoppingCategory,

        @Field("amount")
        var shoppingAmount: BigDecimal
)