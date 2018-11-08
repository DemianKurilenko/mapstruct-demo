package com.github.mapstructdemo.medium;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Engine {

    private String fuelType;

    private int partsCount;
}
