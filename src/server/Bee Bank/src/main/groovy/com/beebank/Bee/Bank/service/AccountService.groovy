package com.beebank.Bee.Bank.service

import com.beebank.Bee.Bank.model.Account
import com.beebank.Bee.Bank.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AccountService extends CrudService<Account> {

    @Autowired AccountRepository repository
}
