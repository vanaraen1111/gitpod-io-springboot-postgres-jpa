package com.example.springdatajpa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpa.dao.CitiesRepository;
import com.example.springdatajpa.entity.Cities;

@Service
public class CitiesServices {
    @Autowired
    CitiesRepository cityRepository;

    public List<Cities> list() {
        return cityRepository.findAll();
    }

}
