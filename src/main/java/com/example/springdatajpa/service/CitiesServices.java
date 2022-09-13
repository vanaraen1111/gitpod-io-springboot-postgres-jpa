package com.example.springdatajpa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springdatajpa.dao.CitiesRepository;
import com.example.springdatajpa.entity.City;
import com.example.springdatajpa.model.Cities;

@Service
public class CitiesServices {
    @Autowired
    CitiesRepository cityRepository;

    public List<City> list() {
        return cityRepository.findAll();
    }

    public City findById(String id) {
        return cityRepository.findById(Long.valueOf(id));
    }

}
