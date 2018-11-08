package com.github.mapstructdemo.medium;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SportCar {

    private Engine engine;

    private String color;

    private Long fuelCapacity;
}
