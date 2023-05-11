package com.jlucas.cardapio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlucas.cardapio.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {

}
