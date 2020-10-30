package com.sale.online.vehicle.service.impl;

import com.sale.online.vehicle.entity.Districts;
import com.sale.online.vehicle.entity.ERole;
import com.sale.online.vehicle.entity.Role;
import com.sale.online.vehicle.repository.RoleRepository;
import com.sale.online.vehicle.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role saveRoles(String name) {
        Role role = new Role();
        if (name.equals("admin")){
        role.setName(ERole.ROLE_ADMIN);
        } else {
            role.setName(ERole.ROLE_USER);
        }
                roleRepository.save(role);
        return role;
    }
}
