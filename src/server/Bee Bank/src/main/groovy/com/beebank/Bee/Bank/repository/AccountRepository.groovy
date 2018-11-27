package com.beebank.Bee.Bank.repository

import com.beebank.Bee.Bank.model.Account
import org.springframework.stereotype.Repository

@Repository
interface AccountRepository extends CrudRepository<Account> {
}
