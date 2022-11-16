package com.kira.repository;

import com.kira.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexerRepo extends JpaRepository<Account, String> {
    @Query(value = "Select * from Account where address = :address", nativeQuery = true)
    public List<Account> getByAddress(String address);
}
