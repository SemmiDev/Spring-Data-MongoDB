package com.sammidev

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.config.EnableMongoAuditing

@SpringBootApplication
@EnableMongoAuditing
class SpringDataMongoDbApplication

fun main(args: Array<String>) {
	runApplication<SpringDataMongoDbApplication>(*args)
}
