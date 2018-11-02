package com.github.mapstructdemo.simple;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Car {

    private int wheels;

    private String color;

    private int doorsNumber;
}
