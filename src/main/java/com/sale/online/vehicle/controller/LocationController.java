package com.sale.online.vehicle.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/location")

public class LocationController {

    @GetMapping("/all")
    public String getAll() {
        return "Public Content.";
    }
}
