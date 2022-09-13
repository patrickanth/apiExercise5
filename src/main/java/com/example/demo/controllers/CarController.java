package com.example.demo.controllers;

import com.example.demo.entities.CarDTO;
import com.example.demo.serviceses.Logic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/cars")
public class CarController {

    @Autowired
    Logic logic;

    @GetMapping("/create")
    public CarDTO createNewCar(@RequestParam String id,@RequestParam String modelName,@RequestParam double price){

        return new CarDTO(id,modelName,price);
    }

    public ResponseEntity<CarDTO> printCar(@RequestBody CarDTO carDTO){
        logic.getDetailsCar(carDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
