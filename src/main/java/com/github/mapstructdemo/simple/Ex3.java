package com.github.mapstructdemo.simple;

import org.mapstruct.factory.Mappers;

public class Ex3 { // Update

    public static void main(String[] args) {
        CarModel carModel = new CarModel();
        carModel.setColor("White").setDoorsNumber(4).setMaxSpeed(150).setWheels(4);
        CarSimpleMapper mapper = Mappers.getMapper(CarSimpleMapper.class);

        Car car = new Car();
        car.setColor("Brown");

        System.out.println(car + " : car before update");
        mapper.updateCar(carModel, car);
        System.out.println(car + " : car after update");
    }
}
