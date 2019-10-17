package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.PriceCalculator;
import org.graalvm.compiler.debug.Assertions;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PriceCalculatorTest {
    @Test
    public void should_return_100_when_base_price_is_2000() {
        PriceCalculator priceCalculator = new PriceCalculator();

        double shippineCost = priceCalculator.getShippingCost(2000.0);

        assertEquals(shippineCost, 100.0, 1);
    }

    @Test
    public void should_get_discount_when_base_price_is_200_and_quantity_505() {
        PriceCalculator priceCalculator = new PriceCalculator();

        double shippineCost = priceCalculator.getDiscount(505, 200);

        assertEquals(shippineCost, 50.0, 1);
    }

    @Test
    public void should_get_price_when_when_base_price_is_200_and_quantity_505() {
        PriceCalculator priceCalculator = new PriceCalculator();

        double shippineCost = priceCalculator.getPrice(505, 200);

        assertEquals(shippineCost, 101050.0, 1);
    }
}
