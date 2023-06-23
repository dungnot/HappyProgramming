package com.hanhphuc.crud.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hanhphuc.crud.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    public Optional<Account> findByEmail(String email);
}
