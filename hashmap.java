import java.util.*;

public class hashmap {
    public static void main(String args[]) {

        // Create a HashMap (stores data as key-value pairs)
        HashMap<String, Integer> set = new HashMap<>();

        // Add values into the map
        set.put("India", 120);
        set.put("US", 30);
        set.put("China", 150);

        // Print the map
        System.out.println(set);

        // Update value of an existing key
        set.put("China", 180);
        System.out.println(set);

        // Check if a key exists in the map
        if (set.containsKey("Indonesia")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }

        // Get value using key
        System.out.println(set.get("China"));      // key exists
        System.out.println(set.get("Indonesia"));  // key does not exist (returns null)

        // Loop through map using entrySet (key + value)
        for (Map.Entry<String, Integer> e : set.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Loop through map using only keys
        Set<String> keys = set.keySet();
        for (String key : keys) {
            System.out.println(key + " " + set.get(key));
        }

        // Remove a key from the map
        set.remove("China");
        System.out.println(set);
    }
}
