package com.urban.microservices.urbanservice.service;

import com.urban.microservices.urbanservice.domain.Account;
import com.urban.microservices.urbanservice.dto.AccountBuilder;
import com.urban.microservices.urbanservice.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    public Account createAccount(Account account){
        return accountRepository.save(account);
    }

    public Account getAccount(Long id){
        return accountRepository.findOne(id);
    }

    public Collection<Account> findByName(String name){
        return accountRepository.findByName(name);
    }

    public List<Account> getAll(){
        return accountRepository.findAll();
    }

}
