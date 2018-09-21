package com.avanade.shopping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShoppingCart {

	public int getTotalCost(List<String> items) {

		Map<Product, Integer> itemFrequency = items
							.stream()
							.collect(Collectors.toMap(	k -> Product.valueOf(k),
														v -> 1,
														Integer::sum));
		
		return itemFrequency.entrySet()
							.stream()
							.mapToInt(p -> getCost(p))
							.reduce(0, (a, b) -> a + b);
	}

	private int getCost(Map.Entry<Product, Integer> p) {
		return p.getKey().getOffer().calculateCost(p.getKey().getPrice(), p.getValue());
	}

}
