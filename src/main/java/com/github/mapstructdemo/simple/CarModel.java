package com.github.mapstructdemo.simple;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CarModel {

    private int wheels;

    private String color;

    private int doorsNumber;

    private double maxSpeed;

    private long enginePower;

    private String design;
}
