package io.security.corespringsecurity.security.service;

import io.security.corespringsecurity.domain.Account;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.ArrayList;

@Data
public class AccountContext extends User {
    private Account account;

    public AccountContext(Account account, ArrayList<GrantedAuthority> roles) {
        super(account.getUsername(), account.getPassword(), roles);
        this.account = account;
    }

}