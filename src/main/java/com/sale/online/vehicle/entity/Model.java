package com.sale.online.vehicle.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author dilshanboteju
 */

@Entity
@Table(name = "model_vehicle")
@Data
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long makeId;

    private String modelName;
}
