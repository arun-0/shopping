package com.avanade.shopping;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OfferTest {

	private static int price = 10;

	@Test
	public void testOfferTwoForOne() {
		Offer twoForOneOffer = Offer.twoForOne();
		assertEquals(0, twoForOneOffer.calculateCost(price, 0));
		assertEquals(10, twoForOneOffer.calculateCost(price, 1));
		assertEquals(10, twoForOneOffer.calculateCost(price, 2));
		assertEquals(20, twoForOneOffer.calculateCost(price, 3));
		assertEquals(20, twoForOneOffer.calculateCost(price, 4));
		assertEquals(30, twoForOneOffer.calculateCost(price, 5));
	}

	@Test
	public void testOfferThreeForTwo() {
		Offer threeForTwoOffer = Offer.threeForTwo();
		assertEquals(0, threeForTwoOffer.calculateCost(price, 0));
		assertEquals(10, threeForTwoOffer.calculateCost(price, 1));
		assertEquals(20, threeForTwoOffer.calculateCost(price, 2));
		assertEquals(20, threeForTwoOffer.calculateCost(price, 3));
		assertEquals(30, threeForTwoOffer.calculateCost(price, 4));
		assertEquals(40, threeForTwoOffer.calculateCost(price, 5));
		assertEquals(40, threeForTwoOffer.calculateCost(price, 6));
		assertEquals(50, threeForTwoOffer.calculateCost(price, 7));
	}

	@Test
	public void testOfferNone() {
		Offer twoForOneOffer = Offer.none();
		assertEquals(0, twoForOneOffer.calculateCost(price, 0));
		assertEquals(10, twoForOneOffer.calculateCost(price, 1));
		assertEquals(20, twoForOneOffer.calculateCost(price, 2));
		assertEquals(30, twoForOneOffer.calculateCost(price, 3));
		assertEquals(40, twoForOneOffer.calculateCost(price, 4));
	}

}
