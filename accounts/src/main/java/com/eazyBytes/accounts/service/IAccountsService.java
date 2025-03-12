package com.eazyBytes.accounts.service;

import com.eazyBytes.accounts.dto.AccountsDto;
import com.eazyBytes.accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
    CustomerDto fetchAccountDetails(String mobileNumber);

    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);
}
