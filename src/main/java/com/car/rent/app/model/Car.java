package com.car.rent.app.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Car extends AbstractBaseEntity {
    @Column(nullable = false, unique = true)
    private String name;
}
