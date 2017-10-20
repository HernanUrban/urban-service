package com.urban.microservices.urbanservice.repo;

import com.urban.microservices.urbanservice.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Collection<Account> findByName(String name);
}
