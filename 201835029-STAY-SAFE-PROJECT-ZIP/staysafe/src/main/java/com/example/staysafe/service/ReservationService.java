package com.example.staysafe.service;


import com.example.staysafe.domain.Reservation;
import com.example.staysafe.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repo;

    public List<Reservation> listAll(){
        return repo.findAll();
    }

    public void save(Reservation std){
        repo.save(std);
    }

    public Reservation get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id){
        repo.deleteById(id);
    }


}
