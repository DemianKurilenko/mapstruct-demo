package com.github.mapstructdemo.simple;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper
public interface CarSimpleMapper {

    CarDto toCarDto(CarModel carModel);

    @Mapping(target = "wheelsAnother", source = "wheels")
    @Mapping(target = "colorAnother", source = "color")
    @Mapping(target = "doorsNumberAnother", source = "doorsNumber")
   // @Mapping(target = "customDetail", ignore = true)
    @Mapping(target = "customDetail", source = "design", defaultValue = "Sport")
    CarAnotherDto toCarAnotherDto(CarModel carModel);

    void updateCar(CarModel carModel, @MappingTarget Car car);

    Car updateCarWithReturnCar(CarModel carModel, @MappingTarget Car car);
}
