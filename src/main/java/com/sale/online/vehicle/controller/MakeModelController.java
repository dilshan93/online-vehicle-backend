package com.sale.online.vehicle.controller;

import com.sale.online.vehicle.entity.Make;
import com.sale.online.vehicle.entity.Model;
import com.sale.online.vehicle.payload.response.MessageResponse;
import com.sale.online.vehicle.service.MakeModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author dilshanboteju
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/makemodel")
public class MakeModelController {

    @Autowired
    MakeModelService makeModelService;

    @PostMapping("/saveMake")
    public ResponseEntity<?> creatMake(@Valid @RequestBody Make make){
        return makeModelService.saveMake(make);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAllMake(){
        if (makeModelService.getAllMake() ==null){
            return ResponseEntity.noContent().build();
        }
        List<Make> makes = makeModelService.getAllMake();
        return ResponseEntity.ok().body(makes);
    }

    @PostMapping("/saveModel")
    public ResponseEntity<?> createModelr(@Valid @RequestBody Model model){
        return makeModelService.saveModel(model);
    }

    @GetMapping("/getByMake/{id}")
    public ResponseEntity<?> findByMake(@PathVariable(value = "id") long makeId){
        if (makeModelService.getModelByMake(makeId) ==null){
            return ResponseEntity.noContent().build();
        }
        List<Model> model = makeModelService.getModelByMake(makeId);
        return ResponseEntity.ok().body(model);
    }

    @GetMapping("/getAllModel")
    public ResponseEntity<?> getAllmodel(){
        if (makeModelService.getAllModel() ==null){
            return ResponseEntity.noContent().build();
        }
        List<Model> model = makeModelService.getAllModel();
        return ResponseEntity.ok().body(model);
    }
}
