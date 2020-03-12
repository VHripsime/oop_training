package main.java.am.hsp.apps.oop.investigation.collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrating how HashMap works.
 *
 * @author hripsime
 *
 */
public class PlayerDemo {

    public static void main(String[] args) {

        Map<String, Integer> players = new HashMap<String, Integer>();

        players.put("King", 100);
        players.put("Clark", 90);
        players.put("Blake", 10);
        players.put("Ford", 110);
        players.put("Smith", 10);
        players.put("Ward", 99);
        players.put("Jones", 99);

        System.out.println(players.get("King"));
        System.out.println(players.get("Clark"));
        System.out.println(players.get("Blake"));
        System.out.println(players.get("Ford"));
        System.out.println(players.get("Smith"));
        System.out.println(players.get("Ward"));
        System.out.println(players.get("Jones"));
    }
}
