package main.java.am.hsp.apps.oop.investigation.collections.map.hashmap.no_hashcode_equals_contract;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrating how HashMap works without "equals-hashcode" contract.
 * 
 * @author hripsime
 *
 */
public class NoContractDemo {

    public static void main(String[] args) {

        EmployeeKey firstKey = new EmployeeKey("A001", 1971);
        EmployeeKey secondKey = new EmployeeKey("A002", 1972);
        EmployeeKey thirdKey = new EmployeeKey("A003", 1973);

        Map<EmployeeKey, String> employees = new HashMap<>();

        employees.put(firstKey, "Smith");
        employees.put(secondKey, "Jhone");
        employees.put(thirdKey, "Clark");

        System.out.println("Getting the element under the first key: " + employees.get(firstKey));

        EmployeeKey newKey = new EmployeeKey("A001", 1971);
        System.out.println("\nGetting the element under the new key equal to the first one: " + employees.get(newKey));

        firstKey.setBirthYear(1974);
        System.out.println(
                "\nGetting the element under the first key, after changing the year: " + employees.get(firstKey));
    }
}
