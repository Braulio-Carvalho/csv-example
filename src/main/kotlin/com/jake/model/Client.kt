package com.jake.model

import java.math.BigDecimal

data class Client(
    val cpf: String,
    val firstName: String,
    val lastName: String,
    val transactionAmount: BigDecimal
)
