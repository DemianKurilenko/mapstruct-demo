package com.github.mapstructdemo.simple;

import lombok.Data;

@Data
public class CarDto {

    private int wheels;

    private String color;

    private int doorsNumber;

    private double maxSpeed;
}
