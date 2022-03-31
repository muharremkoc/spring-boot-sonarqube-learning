package com.sonar.springbootsonarqube.service;

import com.sonar.springbootsonarqube.dto.DrinkDto;
import com.sonar.springbootsonarqube.enums.Stock;
import com.sonar.springbootsonarqube.mapper.DrinkMapper;
import com.sonar.springbootsonarqube.model.Drink;
import com.sonar.springbootsonarqube.repository.DrinkRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DrinkServiceImpl implements DrinkService{

    final DrinkRepository drinkRepository;
    final DrinkMapper drinkMapper;

    String values;

    @Override
    public Drink saveDrink(DrinkDto drinkDto, Stock stock) {
        Drink newDrink=drinkMapper.drinkDtoToDrink(drinkDto);
        newDrink.setStock(stock);
        return drinkRepository.save(newDrink);
    }

    @Override
    public Drink updateDrink(String id,DrinkDto drinkDto, Stock stock) {
        Drink existDrink=drinkRepository.findById(id).orElseThrow();
        existDrink.setName(drinkDto.getName());
        existDrink.setPrice(drinkDto.getPrice());
        existDrink.setStock(stock);

        return drinkRepository.save(existDrink);
    }

    @Override
    public List<Drink> getDrinks() {
        return drinkRepository.findAll();
    }

    @Override
    public List<Drink> getDrinksInStock(Stock stock) {
        return drinkRepository.findAllByStock(stock);
    }
    @Override
    public Drink getDrink(String id) {
        return drinkRepository.findById(id).orElseThrow();
    }

    @Override
    public void removeDrink(String id) {
         drinkRepository.deleteById(id);
    }
}
