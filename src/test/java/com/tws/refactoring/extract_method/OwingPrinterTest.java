package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void print_total_of_apple_when_orderlist_is_3() {
        printCustomerTotal owingPrinter = new printCustomerTotal();
        List<Order> orderList = addOrderInOrderList(14);

        String actual = owingPrinter.printTotal("Apple", orderList);
        assertEquals(
                "*****************************\n"+
                         "****** Customer totals ******\n"+
                         "*****************************\n"+
                        "name: Apple\n" +
                        "amount: 42.0", actual);
    }

    @Test
    public void print_total_of_banana_when_orderlist_is_2() {
        printCustomerTotal owingPrinter = new printCustomerTotal();
        List<Order> orderList = addOrderInOrderList(12);

        String actual = owingPrinter.printTotal("Banana", orderList);
        assertEquals(
                "*****************************\n"+
                        "****** Customer totals ******\n"+
                        "*****************************\n"+
                        "name: Banana\n" + "amount: 36.0", actual);
    }

    private List<Order> addOrderInOrderList(int amount) {
        List<Order> orderList = new ArrayList<>();
        Order order = new Order(amount);
        Order order2 = new Order(amount);
        Order order3 = new Order(amount);
        orderList.add(order);
        orderList.add(order2);
        orderList.add(order3);
        return orderList;
    }
}