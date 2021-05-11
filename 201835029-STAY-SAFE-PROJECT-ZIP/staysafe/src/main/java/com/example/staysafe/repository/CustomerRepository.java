package com.example.staysafe.repository;

import com.example.staysafe.domain.Customer;
import com.example.staysafe.domain.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
