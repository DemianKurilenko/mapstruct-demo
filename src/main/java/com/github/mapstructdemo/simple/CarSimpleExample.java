package com.github.mapstructdemo.simple;

import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

public class CarSimpleExample {

    public static void main(String[] args) { //NESTED MAPPERS ADD!!! expressions use add
        CarModel carModel = new CarModel();
        carModel.setColor("White").setDoorsNumber(4).setMaxSpeed(150).setWheels(4);
        CarSimpleMapper mapper = Mappers.getMapper(CarSimpleMapper.class);
        CarDto carDto = mapper.toCarDto(carModel);
        System.out.println(carDto);

        CarAnotherDto carAnotherDto = mapper.toCarAnotherDto(carModel);
        System.out.println(carAnotherDto);


        Car car = new Car();
        car.setColor("Red");

        System.out.println(car + " : car before update");
        mapper.updateCar(carModel, car);
        System.out.println(car + " : car after update");

        CarModel emptyCarModel = new CarModel();
        mapper.toCarModelInherit(emptyCarModel, carAnotherDto);
        System.out.println(emptyCarModel + ": inherritted inversed mapper");

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
