package com.avanade.shopping;

/**
 * Offer uses Strategy design pattern
 */
@FunctionalInterface
public interface Offer {

    static Offer none() {
        return (p, q) -> p * q;
    }

    static Offer twoForOne() {
        return (p, q) -> p * (q / 2 + q % 2);
    }

    static Offer threeForTwo() {
        return (p, q) -> p * ((q/3) * 2 + q % 3);
    }

	int calculateCost(int price, int quantity);

}
