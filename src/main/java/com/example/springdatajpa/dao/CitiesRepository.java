package com.example.springdatajpa.dao;

import org.springframework.stereotype.Repository;
import com.example.springdatajpa.entity.City;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CitiesRepository extends JpaRepository<City, Integer> {
    @Query (value="SELECT \"Id\", \"Name\", \"Population\" FROM public.\"Cities\"", nativeQuery = true)
    List<City> findAll();
}
