package com.example.springdatajpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.example.springdatajpa.dao.CitiesRepository;
import com.example.springdatajpa.entity.City;

@ExtendWith(SpringExtension.class)
public class CitiesServicesTest {

    @InjectMocks
    private CitiesServices citiesServices;

    @Mock
    private CitiesRepository cityRepository;


    @Test
    void testGetCityById_success() {
        City citythree = new City();
        citythree.setName("Prague");

        when(cityRepository.findById(new Long(3))).thenReturn(Optional.of(citythree));

        assertEquals("Prague", citiesServices.getCityById(new Long(3)).getName());
    }

    @Test
    void testGetCityById_whenGetNull_returnNull() {
        when(cityRepository.findById(new Long(3))).thenReturn(Optional.empty());
        assertNull(citiesServices.getCityById(new Long(3)));
    }
}
