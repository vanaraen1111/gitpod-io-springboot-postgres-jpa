package com.example.springdatajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpa.dao.CitiesRepository;
import com.example.springdatajpa.entity.City;

@Service
public class CitiesServices {
    @Autowired
    CitiesRepository cityRepository;

    public List<City> list() {
        return cityRepository.findAll();
    }

    public Optional<City> getCityById(int id) {
        return cityRepository.findById(id);
    }
}
