package com.example.springdatajpa.dao;

import org.springframework.stereotype.Repository;
import com.example.springdatajpa.entity.Cities;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CitiesRepository extends JpaRepository<Cities, Integer> {
   
}
