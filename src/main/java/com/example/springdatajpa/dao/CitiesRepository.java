package com.example.springdatajpa.dao;

import org.springframework.stereotype.Repository;
import com.example.springdatajpa.entity.City;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface CitiesRepository extends JpaRepository<City, Integer> {
    @Query (value="SELECT \"Id\", \"Name\", \"Population\" FROM public.\"Cities\"", nativeQuery = true)
    List<City> findAll();

    @Query (value="SELECT \"Id\", \"Name\", \"Population\" FROM public.\"Cities\" where \"Id\" = :id", nativeQuery = true)
    Optional<City> findById(@Param("id") Long id) ;
    
}
