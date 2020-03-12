package main.java.am.hsp.apps.oop.investigation.collections.map.concurrent_hashmap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Demonstrating how ConcurrentHashMap works.
 * 
 * @author hripsime
 *
 */
public class ConcurrentHashMapDemo {

    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> cities = new ConcurrentHashMap<>();

        cities.put("Yerevan", 1100);
        cities.put("London", 8100);
        cities.put("Beijing", 21700);

        System.out
                .println("Getting the 'city-order quantity' combination and adding a new combination simultaniously: ");

        processOrders(cities);
    }

    /**
     * Printing the direction and the order quantity.
     */
    private static void processOrders(Map<String, Integer> map) {
        Set<Entry<String, Integer>> entry = map.entrySet();

        for (Entry<String, Integer> combination : entry) {
            System.out.println(combination);
            map.put("Paris", 2200);
        }
    }
}
