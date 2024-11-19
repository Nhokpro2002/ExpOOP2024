package hus.oop.lab8.collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
    /**
     * Function to return the number of key-value mappings of a map
     */
    public static int count(Map<Integer, Integer> map) {
        // TODO
        return map.size();
    }

    /**
     * Function to remove all mappings from a map
     */
    public static void empty(Map<Integer, Integer> map) {
        // TODO
        map.clear();
    }

    /**
     * Function to test if a map contains a mapping for the specified key
     */
    public static boolean contains(Map<Integer, Integer> map, int key) {
        // TODO
        return map.containsKey(key);
    }

    /**
     * Function to test if a map contains a mapping for the specified key and if its value equals the specified value
     */
    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        // TODO
        return map.get(key) == value;
    }

    /**
     * Function to return the key set of map
     */
    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        // TODO
        return map.keySet();
    }

    /**
     * Function to return the values of a map
     */
    public static Collection<Integer> values(Map<Integer, Integer> map) {
        // TODO
        return map.values();
    }

    /**
     * Function, internally using a map, returning "black", "white", or "red" depending on int input value.
     * "black" = 0, "white" = 1, "red" = 2
     */
    public static String getColor(int value) {
        // TODO
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "red");

        return map.get(value);

    }
}
