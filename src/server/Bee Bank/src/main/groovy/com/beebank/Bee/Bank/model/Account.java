package com.beebank.Bee.Bank.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table
@Entity(name = "account")
public class Account extends ModelEntity {

    public long balance;

    @OneToOne
    public User user;
}
