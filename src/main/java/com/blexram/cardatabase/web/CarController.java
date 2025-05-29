package com.blexram.cardatabase.web;

import com.blexram.cardatabase.domain.CarRepository;
import com.blexram.cardatabase.domain.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    private final CarRepository repository;

    public CarController(CarRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/cars")
    public Iterable<Car> getCars() {
        return repository.findAll();
    }
}
