package com.beebank.Bee.Bank.controller

import com.beebank.Bee.Bank.model.Account
import com.beebank.Bee.Bank.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/account")
class AccountController extends CrudController<Account> {

    @Autowired AccountService service
}
