package com.github.mapstructdemo.simple;

import org.mapstruct.factory.Mappers;

public class Ex4 {


    public static void main(String[] args) { //Inherritted inversed mapper
        CarModel carModel = new CarModel();
        carModel.setColor("White").setDoorsNumber(4).setMaxSpeed(150).setWheels(4);
        CarSimpleMapper mapper = Mappers.getMapper(CarSimpleMapper.class);

        CarAnotherDto carAnotherDto = mapper.toCarAnotherDto(carModel);
        System.out.println(carAnotherDto);

        CarModel emptyCarModel = new CarModel();
        mapper.toCarModelInherit(emptyCarModel, carAnotherDto);
        System.out.println(emptyCarModel + ": inherritted inversed mapper");
    }
}
