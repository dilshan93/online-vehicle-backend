package com.sale.online.vehicle.repository;

import com.sale.online.vehicle.entity.ERole;
import com.sale.online.vehicle.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}
