package com.learnToCode.accounts.repository;

import com.learnToCode.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    //whever we are "updating and deleting data" we should use transactional and modifying
    //As we are modifying data, so if anything mishappens then please rollback the data
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}

