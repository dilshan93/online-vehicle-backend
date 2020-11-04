package com.sale.online.vehicle.service;

import com.sale.online.vehicle.entity.Make;
import com.sale.online.vehicle.entity.Model;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * @author dilshanboteju
 */
public interface MakeModelService {

    ResponseEntity<?> saveMake(Make make);

    List<Make> getAllMake();

    ResponseEntity<?> saveModel(Model model);

    List<Model> getModelByMake(Long makeId);

    List<Model> getAllModel();
}
