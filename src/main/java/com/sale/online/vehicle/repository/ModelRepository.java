package com.sale.online.vehicle.repository;

import com.sale.online.vehicle.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dilshanboteju
 */
@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {

    Model findByMakeIdAndModelName(Long id, String name);

    List<Model> findByMakeId(Long id);
}
