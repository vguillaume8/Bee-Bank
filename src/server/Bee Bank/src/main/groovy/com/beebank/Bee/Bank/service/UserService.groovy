package com.beebank.Bee.Bank.service

import com.beebank.Bee.Bank.model.User
import com.beebank.Bee.Bank.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService extends CrudService<User> {

    @Autowired UserRepository repository
}
