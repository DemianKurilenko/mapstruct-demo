package com.github.mapstructdemo.simple;

import org.mapstruct.factory.Mappers;

public class Ex1 {
    public static void main(String[] args) {

        CarModel carModel = new CarModel();
        carModel.setColor("White").setDoorsNumber(4).setMaxSpeed(150).setWheels(4);
        CarSimpleMapper mapper = Mappers.getMapper(CarSimpleMapper.class);
        CarDto carDto = mapper.toCarDto(carModel);
        System.out.println(carDto);
    }
    }
