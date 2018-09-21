package com.avanade.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static com.avanade.shopping.Product.Apple;
import static com.avanade.shopping.Product.Banana;
import static com.avanade.shopping.Product.Melon;
import static com.avanade.shopping.Product.Lime;

public class ProductTest {


	@Test
	public void testProducts() {
		assertEquals(35, Apple.getPrice());
		assertEquals(Offer.none(), Apple.getOffer());

		assertEquals(20, Banana.getPrice());
		assertEquals(Offer.none(), Banana.getOffer());

		assertEquals(50, Melon.getPrice());
		assertEquals(Offer.twoForOne(), Melon.getOffer());

		assertEquals(15, Lime.getPrice());
		assertEquals(Offer.threeForTwo(), Lime.getOffer());
	}

}
