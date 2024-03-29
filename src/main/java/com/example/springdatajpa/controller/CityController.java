package com.example.springdatajpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus.Series;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpa.model.BaseResponse;
import com.example.springdatajpa.service.CitiesServices;

@RestController
public class CityController {

    @Autowired
    private CitiesServices citiesServices;

    @GetMapping("api/cities")
    public ResponseEntity<BaseResponse> getCities() {
        BaseResponse response = new BaseResponse();
        response.setResponseData(citiesServices.list());
        response.setStatus(Series.SUCCESSFUL.name());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("api/cities/id")
    public ResponseEntity<BaseResponse> getCitiesById(@RequestParam(value = "id") Long id) {
        BaseResponse response = new BaseResponse();
        response.setResponseData(citiesServices.getCityById(id));
        response.setStatus(Series.SUCCESSFUL.name());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

      
}
