package com.demo.kotlin.dto.response

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
data class ObjectResponse(
    var id: Int,
    var name: String,
    var email: String?
)
