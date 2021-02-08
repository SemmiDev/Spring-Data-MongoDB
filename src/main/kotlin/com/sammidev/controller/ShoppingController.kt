package com.sammidev.controller

import com.sammidev.entity.Shopping
import com.sammidev.service.ShoppingService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/shopping")
class ShoppingController(val shoppingService: ShoppingService) {

    @PostMapping
    fun addShopping(@RequestBody shopping: Shopping): ResponseEntity<HttpStatus> {
        shoppingService.addShopping(shopping)
        return ResponseEntity(HttpStatus.CREATED)
    }

    @GetMapping
    fun findAllShoppingshopping(): ResponseEntity<MutableList<Shopping>> {
        val result = shoppingService.allShopping()
        return ResponseEntity.ok(result)
    }

    @PutMapping
    fun updateShopping(@RequestBody shopping: Shopping): ResponseEntity.BodyBuilder {
        shoppingService.updateShopping(shopping)
        return ResponseEntity.status(HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun deleteShopping(@PathVariable id: String): ResponseEntity.HeadersBuilder<*> {
        shoppingService.deleteShopping(id)
        return ResponseEntity.noContent()
    }

    @DeleteMapping
    fun deleteShopping(@RequestBody shopping: Shopping): ResponseEntity.HeadersBuilder<*> {
        shoppingService.deleteShopping(shopping)
        return ResponseEntity.noContent()
    }
}