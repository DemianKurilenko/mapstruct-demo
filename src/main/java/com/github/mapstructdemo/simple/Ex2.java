package com.github.mapstructdemo.simple;

import org.mapstruct.factory.Mappers;

public class Ex2 {

    public static void main(String[] args) {
        CarModel carModel = new CarModel();
        carModel.setColor("White").setDoorsNumber(4).setMaxSpeed(150).setWheels(4);
        CarSimpleMapper mapper = Mappers.getMapper(CarSimpleMapper.class);

        CarAnotherDto carAnotherDto = mapper.toCarAnotherDto(carModel);
        System.out.println(carAnotherDto);
    }
}
