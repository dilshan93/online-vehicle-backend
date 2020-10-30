package com.sale.online.vehicle.controller;

//import com.sale.online.vehicle.entity.Districts;
//import com.sale.online.vehicle.service.LocationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import com.sale.online.vehicle.entity.Role;
import com.sale.online.vehicle.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/location")

public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/getAll")
    public String getAll() {

        return "This is working !!!!!";
    }


    @PostMapping("/saveRoles")
    public String saveRoles(@RequestParam String name) {

        Role role = locationService.saveRoles(name);
        return "role id >> "+role.getId()+"role name >>> "+role.getName();
    }
}
