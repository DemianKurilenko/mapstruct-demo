package com.github.mapstructdemo.simple;

import org.mapstruct.factory.Mappers;

public class CarSimpleExample {

    public static void main(String[] args) {
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
    }
}
