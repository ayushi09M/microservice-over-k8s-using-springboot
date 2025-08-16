package com.learnToCode.accounts.entity;

import com.learnToCode.accounts.dto.AccountsDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Accounts extends BaseEntity{

    //foreign key
    @Column(name = "customer_id")
    private Long customerId;


//    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "native")
//    @GenericGenerator(name = "native", strategy = "native")
    /*Not using above annotation bcoz we don't want that id should start as 1,2,3
     it should be manual as 10 digit account number*/
    @Id
    @Column(name = "account_number")
    private long accountNumber;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "branch_address")
    private String branchAddress;
}
