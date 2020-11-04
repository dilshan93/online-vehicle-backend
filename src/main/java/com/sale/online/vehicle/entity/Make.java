package com.sale.online.vehicle.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author dilshanboteju
 */

@Entity
@Table(name = "make_vehicle",
        uniqueConstraints = {@UniqueConstraint(columnNames = "makeName")})
@Data
public class Make {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String makeName;
}
