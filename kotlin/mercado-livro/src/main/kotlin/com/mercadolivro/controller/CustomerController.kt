package com.mercadolivro.controller

import com.mercadolivro.controller.request.PostCustomerRequest
import com.mercadolivro.controller.request.PutCustomerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("customer")
class CustomerController {

    val customers = mutableListOf<CustomerModel>()

    @GetMapping
    fun getAll(): MutableList<CustomerModel> {
        return customers
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody customer: PostCustomerRequest) {
        val id = if (customers.isEmpty()) {
            1
        } else {
            customers.last().id.toInt() + 1
        }.toString()
        customers.add(CustomerModel(id,customer.name,customer.email))
    }

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: String): CustomerModel {
        return customers.filter{ it.id == id}.first()
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: String, @RequestBody customer: PutCustomerRequest) {
       customers.filter{ it.id == id}.first().let {
           it.name = customer.name
           it.email = customer.email
       }
    }
}