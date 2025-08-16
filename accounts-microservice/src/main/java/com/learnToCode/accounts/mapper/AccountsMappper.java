package com.learnToCode.accounts.mapper;

import com.learnToCode.accounts.dto.AccountsDTO;
import com.learnToCode.accounts.entity.Accounts;

//In order to save data in the database with the help of repo interfaces we send the object of Customer itself, not the DTO class.
//So must be some logic which convert the DTO to entity and entity to DTO
public class AccountsMappper {

    //Mapping (Entity in  DTO)
    public static AccountsDTO mapToAccountsDTO(Accounts accounts, AccountsDTO accountsDTO) {
        accountsDTO.setAccountNumber(accounts.getAccountNumber());
        accountsDTO.setAccountType(accounts.getAccountType());
        accountsDTO.setBranchAddrss(accounts.getBranchAddress());

        return accountsDTO;
    }

    //Mapping (DTO in Entity)
    public static Accounts mapToAccountsEntity( AccountsDTO accountsDTO, Accounts accounts) {
        accounts.setAccountNumber(accountsDTO.getAccountNumber());
        accounts.setAccountType(accountsDTO.getAccountType());
        accounts.setBranchAddress(accountsDTO.getBranchAddrss());

        return accounts;
    }
}