package com.sonar.springbootsonarqube.controller;

import com.sonar.springbootsonarqube.dto.DrinkDto;
import com.sonar.springbootsonarqube.enums.Stock;
import com.sonar.springbootsonarqube.model.Drink;
import com.sonar.springbootsonarqube.service.DrinkService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/api/version/1/sonar")
public class DrinkController {

    final DrinkService drinkService;



    @PostMapping("/drink")
    public Drink createDrink(@RequestBody DrinkDto drinkDto, @RequestParam Stock stock){
        return drinkService.saveDrink(drinkDto, stock);
    }
    @PutMapping("/drink/{id}")
    public Drink updateDrink(@PathVariable("id") String id,@RequestBody DrinkDto drinkDto, @RequestParam Stock stock){
        return drinkService.updateDrink(id,drinkDto, stock);
    }

    @GetMapping("/drink")
    public List<Drink> getAllDrinks(){
        return drinkService.getDrinks();
    }

    @GetMapping("/drink/InStock")
    public List<Drink> getAllDrinksInStock(@RequestParam Stock stock){
        return drinkService.getDrinksInStock(stock);
    }

    @GetMapping("/drink/{id}")
    public Drink getDrink(@PathVariable("id") String id){
        return drinkService.getDrink(id);
    }

    @DeleteMapping("/drink/{id}")
    public void removeDrink(@PathVariable("id") String id){
         drinkService.removeDrink(id);
    }



}
