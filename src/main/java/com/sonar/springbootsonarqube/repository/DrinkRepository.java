package com.sonar.springbootsonarqube.repository;

import com.sonar.springbootsonarqube.enums.Stock;
import com.sonar.springbootsonarqube.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DrinkRepository extends JpaRepository<Drink,String> {

    List<Drink> findAllByStock(Stock stock);
}
