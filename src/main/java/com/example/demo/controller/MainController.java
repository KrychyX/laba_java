package com.example.demo.controller;

import com.example.demo.thing.Car;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/api/main")
    public String mainListener(){
        return "Hello World";
    }

    @GetMapping("/api/car")
    public String giveCar(){
        Car car = new Car(299,2001,"Mercedes");
        String jsonData = null;
        try {
            jsonData = objectMapper.writeValueAsString(car);
        }catch(JsonProcessingException e){
            System.out.println("Car not read");
        }
        return jsonData;
    }

    @PostMapping("/api/key")
    public String giveKeyCar(@RequestParam String mark, @RequestParam int year){
        Car car = new Car(299,year,mark);
        String jsonData = null;
        try {
            jsonData = objectMapper.writeValueAsString(car);
        }catch(JsonProcessingException e){
            System.out.println("Car not read");
        }
        return jsonData;
    }
}
