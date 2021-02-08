package com.sammidev.service

import com.sammidev.entity.Shopping
import com.sammidev.exception.NotFoundException
import com.sammidev.repository.ShoppingRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ShoppingService(val shoppingRepository: ShoppingRepository) {

    fun addShopping(shopping: Shopping) {
        shoppingRepository.insert(shopping)
    }

    fun allShopping(): MutableList<Shopping> {
        return shoppingRepository.findAll()
    }

    fun updateShopping(shopping: Shopping) {
        val savedShopping = shoppingRepository
                .findById(shopping.id!!).orElseThrow { NotFoundException("ID : ${shopping.id} NOT FOUND") }

        savedShopping.shoppingName = shopping.shoppingName
        savedShopping.shoppingCategory = shopping.shoppingCategory
        savedShopping.shoppingAmount = shopping.shoppingAmount

        shoppingRepository.save(savedShopping)
    }

    fun deleteShopping(id: String) {
        shoppingRepository.deleteById(id)
    }

    fun deleteShopping(shopping: Shopping) {
        shoppingRepository.delete(shopping)
    }
}