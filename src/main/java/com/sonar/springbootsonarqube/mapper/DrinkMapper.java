package com.sonar.springbootsonarqube.mapper;

import com.sonar.springbootsonarqube.dto.DrinkDto;
import com.sonar.springbootsonarqube.model.Drink;
import org.mapstruct.Mapper;

@Mapper
public interface DrinkMapper {

    Drink drinkDtoToDrink(DrinkDto drinkDto);
}
