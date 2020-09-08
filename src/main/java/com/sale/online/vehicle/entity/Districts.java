package com.sale.online.vehicle.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "location_districs",
        uniqueConstraints = {@UniqueConstraint(columnNames = "name")})
@Data
public class Districts {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String areaCoordinates;
}
