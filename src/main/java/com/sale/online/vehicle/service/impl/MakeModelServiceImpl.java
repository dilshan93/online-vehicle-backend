package com.sale.online.vehicle.service.impl;

import com.sale.online.vehicle.entity.Make;
import com.sale.online.vehicle.entity.Model;
import com.sale.online.vehicle.payload.response.MessageResponse;
import com.sale.online.vehicle.repository.MakeRepository;
import com.sale.online.vehicle.repository.ModelRepository;
import com.sale.online.vehicle.service.MakeModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author dilshanboteju
 */
@Service
@Transactional
public class MakeModelServiceImpl implements MakeModelService {

    @Autowired
    MakeRepository makeRepository;

    @Autowired
    ModelRepository modelRepository;

    public ResponseEntity<?> saveMake(Make make) {
        if (makeRepository.findBymakeName(make.getMakeName())!= null) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Make is already Registerd!"));
        }
        return ResponseEntity.ok(makeRepository.save(make));
    }

    @Override
    public List<Make> getAllMake() {
        return makeRepository.findAll();
    }

    @Override
    public ResponseEntity<?> saveModel(Model model) {
        if (modelRepository.findByMakeIdAndModelName(model.getMakeId() , model.getModelName()) != null) {
            return ResponseEntity
                    .badRequest()
                    .body(new MessageResponse("Error: Model is already Registerd with Make!"));
        }
        return ResponseEntity.ok(modelRepository.save(model));
    }

    @Override
    public List<Model> getModelByMake(Long makeId) {
        return modelRepository.findByMakeId(makeId);
    }

    @Override
    public List<Model> getAllModel() {
        return modelRepository.findAll();
    }
}
