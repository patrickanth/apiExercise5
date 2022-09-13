package com.example.demo.serviceses;

import com.example.demo.entities.CarDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Logic {



    public void getDetailsCar(CarDTO car){
        System.out.println(car.toString());
    }
}
