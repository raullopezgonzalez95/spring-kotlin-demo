package com.demo.kotlin.controller

import com.demo.kotlin.service.GetService
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@AllArgsConstructor
@NoArgsConstructor
class GetController(val service: GetService) {
    @GetMapping("/hello-wolrd")
    fun helloWorld() = "Hello Wolrd!"

    @GetMapping("/{string}")
    fun getString(
        @PathVariable(value = "string", name = "string", required = true)
        string: String): String {
        return service.getString(string)
    }

    @GetMapping("/object")
    fun getObject() = service.getObject()

    @GetMapping("/objects")
    fun getObjects() = service.getObjects()
}
