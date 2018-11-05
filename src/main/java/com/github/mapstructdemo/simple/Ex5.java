package com.github.mapstructdemo.simple;

import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

public class Ex5 {
    public static void main(String[] args) {
        CarSimpleMapper mapper = Mappers.getMapper(CarSimpleMapper.class);

        CarModel carModel = new CarModel();
        carModel.setColor("White").setDoorsNumber(4).setMaxSpeed(150).setWheels(4);
        CarModel secondModel = new CarModel();
        secondModel.setColor("Green").setDoorsNumber(2).setMaxSpeed(120).setWheels(4);
        CarModel thirdModel = new CarModel();
        thirdModel.setColor("Red").setDoorsNumber(6).setMaxSpeed(180).setWheels(6);
        List<CarModel> carModels = new ArrayList<>();
        carModels.add(carModel);
        carModels.add(secondModel);
        carModels.add(thirdModel);
        List<CarAnotherDto> carAnotherDtos = mapper.toCarAnotherDtos(carModels);
        System.out.println(carAnotherDtos + ": List of car DTOs");
    }
}
