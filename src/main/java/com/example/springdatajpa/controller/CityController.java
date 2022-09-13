package com.example.springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springdatajpa.service.CitiesServices;

@RestController
public class CityController {
    @Autowired
    private CitiesServices cityServices;
    
    @GetMapping("/api/cities/all")
    public String getAllCities() {
        return cityServices.toString();
    }
}
