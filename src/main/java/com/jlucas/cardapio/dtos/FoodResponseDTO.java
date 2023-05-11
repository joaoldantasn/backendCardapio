package com.jlucas.cardapio.dtos;

import com.jlucas.cardapio.entities.Food;

public record FoodResponseDTO(Long id, String title, String image, Integer price) {
	
	public FoodResponseDTO(Food food) {
		this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
	}
}
