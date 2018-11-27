package com.beebank.Bee.Bank.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class User extends ModelEntity {

    public String username;
    public String email;
    public String firstName;
    public String lastName;
    public String password;

    @OneToOne
    public Account account;
}
