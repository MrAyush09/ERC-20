package com.kira.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table
public class account {
    @Id
    private String address;
    private String transaction;
    private String amount;
}
