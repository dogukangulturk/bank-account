package com.orcrist.account.model

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
data class Customer(

        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String?,

        @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
        val transaction: Set<Account>?

)
