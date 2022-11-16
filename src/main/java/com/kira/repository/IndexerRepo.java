package com.kira.repository;

import com.kira.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IndexerRepo extends JpaRepository<Account, String> {
}
