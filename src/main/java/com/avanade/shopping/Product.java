package com.avanade.shopping;

public enum Product {
	Apple(35),
	Banana(20),
	Melon(50, Offer.twoForOne()),
	Lime(15, Offer.threeForTwo());

	private final int price;	//in pence
	private final Offer offer;

	private Product(int price) {
		this(price, Offer.none());
	}

	private Product(int price, Offer offer) {
		this.price = price;
		this.offer = offer;
	}
	
	int getPrice() {
		return this.price;
	}
	
	Offer getOffer() {
		return this.offer;
	}
}
