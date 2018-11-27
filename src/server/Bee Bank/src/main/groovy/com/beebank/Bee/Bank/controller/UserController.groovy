package com.beebank.Bee.Bank.controller

import com.beebank.Bee.Bank.model.User
import com.beebank.Bee.Bank.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController extends CrudController<User> {

    @Autowired UserService service
}
