package com.car.rent.app.model;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CarModel extends AbstractBaseEntity {

    private Integer defaultLimit;

}
