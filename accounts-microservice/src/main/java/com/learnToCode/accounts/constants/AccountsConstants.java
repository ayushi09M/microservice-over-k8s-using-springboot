package com.learnToCode.accounts.constants;

public class AccountsConstants {

    //Prevents Instantiation:
    //By making the constructor private,
    // you prevent anyone from creating an instance of the AccountsConstants class
    // (i.e., new AccountsConstants() is not allowed).
    private AccountsConstants() {
        //restrict Initialization
    }

    public static final String SAVINGS = "Savings";
    public static final String ADDRESS = "123 Main Street, New York";
    public static final String STATUS_201 ="201";
    public static final String MESSAGE_201 = "Accounts created successfully";
    public static final String STATUS_200 = "200";
    public static final String MESSAGE_200 = "Request processed successfully";
    public static final String STATUS_500 = "500";
    public static final String MESSAGE_500 = "An Error Occured. Please try again later or contact your Dev team!";
}
