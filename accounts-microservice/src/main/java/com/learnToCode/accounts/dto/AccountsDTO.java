package com.learnToCode.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

//Replica of Accounts entity. Use DTO to send only specific data to the client application
@Data
public class AccountsDTO {

   @NotEmpty(message = "Account Number should not be empty")
   @Pattern(regexp = "(^$[0-9]{10})",message = "Account Number should be 10 digits")
   private Long accountNumber;

   @NotEmpty(message = "Account Type should not be empty")
   private String accountType;

   @NotEmpty(message = "Branch Address should not be empty")
   private String branchAddrss;
}
