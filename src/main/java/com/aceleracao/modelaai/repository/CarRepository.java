package com.aceleracao.modelaai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aceleracao.modelaai.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
  
}
