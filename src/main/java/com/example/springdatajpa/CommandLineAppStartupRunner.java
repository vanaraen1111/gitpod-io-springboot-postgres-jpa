package com.example.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.springdatajpa.service.CitiesServices;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    private CitiesServices cityServices;

    @Override
    public void run(String...args) throws Exception {
        System.out.println(cityServices.list());
    }
}