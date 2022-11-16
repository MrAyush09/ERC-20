package com.kira.controller;

import com.kira.entity.Account;
import com.kira.service.IndexerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexerController {
    @Autowired
    private IndexerService indexerService;

    @GetMapping("/{address}")
    public List<Account> fetchData(@PathVariable("address") String address){
        return indexerService.getByAddress(address);
    }
}
