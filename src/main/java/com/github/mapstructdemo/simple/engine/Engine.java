package com.github.mapstructdemo.simple.engine;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Engine {

    private String fuelType;

    private int partsCount;
}
