package com.avanade.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class ShoppingCartTest {

	private ShoppingCart cart = new ShoppingCart();

	@Test
	public void testTotalCost() {
		//Apple, Banana
		List<String> shoppingList = Arrays.asList("Apple", "Apple", "Banana");
		assertEquals(90, cart.getTotalCost(shoppingList));

		shoppingList = Arrays.asList("Apple", "Apple", "Banana", "Banana");
		assertEquals(110, cart.getTotalCost(shoppingList));

		//Melon, Lime
		shoppingList = Arrays.asList("Melon", "Melon", "Lime", "Lime", "Lime");
		assertEquals(80, cart.getTotalCost(shoppingList));
		
		shoppingList = Arrays.asList("Melon", "Melon", "Melon", "Lime", "Lime", "Lime");
		assertEquals(130, cart.getTotalCost(shoppingList));

		shoppingList = Arrays.asList("Melon", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime");
		assertEquals(145, cart.getTotalCost(shoppingList));
		
		//All
		shoppingList = Arrays.asList("Apple", "Apple", "Banana", "Banana", 
				"Melon", "Melon", "Melon", "Lime", "Lime", "Lime", "Lime");
		assertEquals(255, cart.getTotalCost(shoppingList));

	}

}
