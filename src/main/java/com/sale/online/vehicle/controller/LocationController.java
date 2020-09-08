package com.sale.online.vehicle.controller;

import com.sale.online.vehicle.entity.Districts;
import com.sale.online.vehicle.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/location")

public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/getAll")
    public ResponseEntity<List<Districts>> getAll() {

        return new ResponseEntity<>(locationService.getAllDistricts(), HttpStatus.OK);
    }
}
