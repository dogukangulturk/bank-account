package com.orcrist.account.dto

import com.orcrist.account.model.Account

data class CustomerDto(
        val id: String?,
        val name: String?,
        val surname: String?,
        val accounts: Set<CustomerAccountDto>?
)
