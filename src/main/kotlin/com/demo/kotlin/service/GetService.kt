package com.demo.kotlin.service

import com.demo.kotlin.dto.response.ObjectResponse
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import org.springframework.stereotype.Service

@Service
@NoArgsConstructor
@AllArgsConstructor
class GetService {
    fun getString(string: String) = string

    fun getObject() = ObjectResponse(1, "John Doe", "john@example.com")

    fun getObjects() = listOf(
        ObjectResponse(1, "John Doe", "john@example.com"),
        ObjectResponse(2, "Raul Lopez", "raul@mail.com"),
        ObjectResponse(3, "Lucero Vazquez", null)
    )
}
