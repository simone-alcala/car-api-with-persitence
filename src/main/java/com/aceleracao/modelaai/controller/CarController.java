package com.aceleracao.modelaai.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aceleracao.modelaai.dto.CarDTO;
import com.aceleracao.modelaai.model.Car;
import com.aceleracao.modelaai.repository.CarRepository;

@RestController
@RequestMapping("/api/car")
public class CarController {
  
  @Autowired
  private CarRepository repository;

  @PostMapping
  public void create(@RequestBody CarDTO req) {
    repository.save(new Car(req));
  }

  @GetMapping
  public List<Car> findAll() {
    return repository.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Car> findById(@PathVariable("id") Long id) {
    return repository.findById(id);
  }
}
