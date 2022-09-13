package com.example.springdatajpa.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpa.entity.City;
import com.example.springdatajpa.model.Cities;
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

    @Cacheable(value = "cities-id", key = "#{Id}")
    @GetMapping("/api/cities/{Id}")
    public City getCityById(@PathVariable String id) {
        try {
            logger.debug("/api/cities/{Id} => CALLED");
            return cityServices.findById(id);
        } catch (Exception e) {
            logger.debug("/api/cities/{Id} hits ERROR =>", e);
            return null;
        }
    }
}
