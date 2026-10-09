package com.app.food_app.service;

import java.util.List;

import com.app.food_app.dto.TopRestaurantDTO;

public interface TopRestaurantDTOService {
	List<TopRestaurantDTO> findTopRestaurantsByAverageRating();
}
