package com.example.astronaut.ServiceRepo;

import com.example.astronaut.Entity.Astronaut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class AstronautRepositoryImpl implements AstronautRepository {

    private static final String BASE_URL = "http://api.open-notify.org/astros.json";

    @Autowired
    RestTemplate restTemplate;

    @Override
    public Astronaut getAstronautObject() {
         Astronaut responseEntity =
                restTemplate.getForObject(BASE_URL, Astronaut.class);
         return responseEntity;
    }


    // client
    // To basically fetch the records
    // wrapper methods around the services



}
