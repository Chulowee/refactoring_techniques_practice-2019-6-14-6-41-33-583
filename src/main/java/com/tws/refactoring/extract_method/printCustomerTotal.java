package com.tws.refactoring.extract_method;

import java.util.Iterator;
import java.util.List;

public class printCustomerTotal {
    String printTotal(String name, List<Order> orders) {
        Iterator<Order> orderList = orders.iterator();
        double totalAmount = 0.0;
        totalAmount = getTotalAmount(orderList, totalAmount);
        return  "*****************************\n"+
                "****** Customer totals ******\n"+
                "*****************************\n"+
                "name: " + name +"\n"+
                "amount: " + totalAmount;
    }

    private double getTotalAmount(Iterator<Order> orderList, double totalAmount) {
        while (orderList.hasNext()) {
            Order each = orderList.next();
            totalAmount += each.getAmount();
        }
        return totalAmount;
    }
}

class Order {
    private final double amount;

    public Order(double amount) {
        this.amount = amount;
    }

    double getAmount() {
        return amount;
    }
}
