package com.sale.online.vehicle.repository;

import com.sale.online.vehicle.entity.ERole;
import com.sale.online.vehicle.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(ERole name);
}
