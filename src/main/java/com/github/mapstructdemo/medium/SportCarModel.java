package com.github.mapstructdemo.medium;

import lombok.Data;

@Data
public class SportCarModel {

    private EngineModel engine;

    private String color;

    private Long fuelCapacity;
}
