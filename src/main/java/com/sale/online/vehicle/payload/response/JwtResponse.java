package com.sale.online.vehicle.payload.response;

import lombok.Data;

import java.util.List;

@Data
public class JwtResponse {

    private Long id;
    private String token;
    private String type = "Bearer";
    private String username;
    private String email;
    private List<String> roles;

    public JwtResponse(String token, Long id, String username, String email, List<String> roles) {
        this.id = id;
        this.token = token;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}
