package com.beebank.Bee.Bank.repository

import com.beebank.Bee.Bank.model.User
import org.springframework.stereotype.Repository

@Repository
interface UserRepository extends CrudRepository<User> {
}
