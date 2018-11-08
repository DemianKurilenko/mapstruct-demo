package com.github.mapstructdemo.medium;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EngineMapper {

    @Mapping(source = "fuelType", target = "fuelTypeChanged")
    @Mapping(source = "partsCount", target = "partsCountChanged")
    EngineModel toEngineModel(Engine engine);
}
