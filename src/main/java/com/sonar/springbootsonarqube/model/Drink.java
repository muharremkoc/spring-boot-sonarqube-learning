package com.sonar.springbootsonarqube.model;

import com.sonar.springbootsonarqube.enums.Stock;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Builder
@Entity
@Table(name = "DRINKS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Drink {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    String id;

    String name;

   double price;

   @Column(name = "milli_liter")
   double milliLiter;

   @Enumerated(EnumType.STRING)
   Stock stock;

}
