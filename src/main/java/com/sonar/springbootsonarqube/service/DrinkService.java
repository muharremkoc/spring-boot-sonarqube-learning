package com.sonar.springbootsonarqube.service;

import com.sonar.springbootsonarqube.dto.DrinkDto;
import com.sonar.springbootsonarqube.enums.Stock;
import com.sonar.springbootsonarqube.model.Drink;

import java.util.List;

public interface DrinkService {

    Drink saveDrink(DrinkDto drinkDto, Stock stock);
    Drink updateDrink(String id,DrinkDto drinkDto, Stock stock);
    List<Drink> getDrinks();
    List<Drink> getDrinksInStock(Stock stock);
    Drink getDrink(String id);
    void removeDrink(String id);

}
