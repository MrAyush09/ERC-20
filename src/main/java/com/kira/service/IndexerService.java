package com.kira.service;

import com.kira.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IndexerService {
    List<Account> getByAddress(String address);
}
