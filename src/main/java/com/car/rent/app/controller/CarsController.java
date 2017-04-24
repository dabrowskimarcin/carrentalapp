package com.car.rent.app.controller;

import com.car.rent.app.model.Car;
import com.car.rent.app.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarsRepository carsRepository;

    @RequestMapping(method = GET)
    private Collection<Car> cars() {
        return carsRepository.findAll();
    }
}
