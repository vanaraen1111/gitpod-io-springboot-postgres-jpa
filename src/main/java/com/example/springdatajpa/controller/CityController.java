package com.example.springdatajpa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springdatajpa.service.CitiesServices;

@RestController
public class CityController {

private final Logger logger = LoggerFactory.getLogger(CityController.class);

    @Autowired
    private CitiesServices cityServices;
    
    @GetMapping("/api/cities/all")
    public String getAllCities() {
        logger.debug("/api/cities/all => CALLED");
        return cityServices.list().toString();
    }
}
