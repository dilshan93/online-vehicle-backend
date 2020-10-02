package com.sale.online.vehicle.controller;

import com.sale.online.vehicle.payload.request.LoginRequest;
import com.sale.online.vehicle.payload.request.SignupRequest;
import com.sale.online.vehicle.payload.response.JwtResponse;
import com.sale.online.vehicle.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> getLoginUser(@Valid @RequestBody LoginRequest loginRequest){
        JwtResponse jwtResponse = authService.getLoginUser(loginRequest);
        return ResponseEntity.ok(jwtResponse);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@Valid @RequestBody SignupRequest signupRequest){
        ResponseEntity responseEntity = authService.createUser(signupRequest);
        return ResponseEntity.ok(responseEntity);
    }
}
