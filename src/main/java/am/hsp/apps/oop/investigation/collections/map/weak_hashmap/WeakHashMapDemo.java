package main.java.am.hsp.apps.oop.investigation.collections.map.weak_hashmap;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Demonstrating how WeakHashMap works.
 * 
 * @author hripsime
 *
 */
public class WeakHashMapDemo {

    public static void main(String[] args) {

        Map<Order, Integer> orders = new WeakHashMap<>();
        Order forthOrder = new Order(24, "Boxes");

        orders.put(new Order(21, "Bags"), 9700);
        orders.put(new Order(22, "Toys"), 3600);
        orders.put(new Order(23, "Pens"), 1800);
        orders.put(forthOrder, 600);

        System.out.println("Number of orders: " + orders.size());

        System.gc();

        System.out.println("Number of orders after calling the gc() method: " + orders.size());
    }
}
