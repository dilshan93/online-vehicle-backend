package com.sale.online.vehicle.repository;

import com.sale.online.vehicle.entity.ERole;
import com.sale.online.vehicle.entity.Make;
import com.sale.online.vehicle.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dilshanboteju
 */
@Repository
public interface MakeRepository extends JpaRepository<Make, Long> {

    Make findBymakeName(String name);
}
