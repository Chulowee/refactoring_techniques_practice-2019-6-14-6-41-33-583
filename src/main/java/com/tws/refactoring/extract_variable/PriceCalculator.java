package com.tws.refactoring.extract_variable;

public class PriceCalculator {

    private static final double DISCOUNT_RATE = 0.05;
    private static final double SHIPPING_COST_LIMIT = 100.0;

    public double getPrice(int quantity, int itemPrice) {
        double basePrice = quantity * itemPrice;
        double discount = getDiscount(quantity, itemPrice);
        double shippingCost = getShippingCost(basePrice);
        return basePrice - discount + shippingCost ;
    }

    public double getShippingCost(double basePrice) {
        return Math.min(basePrice * 0.1, SHIPPING_COST_LIMIT);
    }

    public double getDiscount(int quantity, int itemPrice) {
        return Math.max(0, quantity - 500) * itemPrice * DISCOUNT_RATE;
    }
}
