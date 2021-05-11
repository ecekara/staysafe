package com.example.staysafe.service;

import com.example.staysafe.domain.Customer;
import com.example.staysafe.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;

    public List<Customer> listAll(){
        return repo.findAll();
    }

    public void save(Customer std){
        repo.save(std);
    }

    public Customer get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id){
        repo.deleteById(id);
    }


}
