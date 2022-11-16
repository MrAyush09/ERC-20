package com.kira.service.impl;

import com.kira.entity.Account;
import com.kira.repository.IndexerRepo;
import com.kira.service.IndexerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IndexerServiceImpl implements IndexerService {
    @Autowired
    private IndexerRepo indexerRepo;

    @Override
    public List<Account> getByAddress(String address){
        return indexerRepo.getByAddress(address);
    }
}
