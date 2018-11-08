package com.github.mapstructdemo.medium;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = EngineMapper.class)
public interface SportCarMapper {

    SportCarModel toSportCarModel(SportCar sportCar);
}
