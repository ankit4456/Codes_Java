import java.util.HashMap;
import java.util.Map;

public class HashMappp {
    public static void main(String[] args) {
        // Creating a HashMap with Integer keys and String values
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs using put()
        map.put(1, "Ankit");
        map.put(2, "Amit");
        map.put(3, "Brahaman");
        map.put(4, "Cat");
        map.put(5, "Direndra");

        // Printing the entire HashMap
        System.out.println("HashMap: " + map);

        // Retrieving all key-value pairs using entrySet()
        System.out.println("Entry Set: " + map.entrySet());

        // Checking if a specific key exists in the HashMap
        System.out.println("Does key 5 exist? " + map.containsKey(5));

        // Checking if a specific value exists in the HashMap
        System.out.println("Does value 'Ankit' exist? " + map.containsValue("Ankit"));

        // Getting the value associated with a specific key
        System.out.println("Value for key 3: " + map.get(3)); //--> this givs value vlaur of the ke

        // Removing an entry using key
        map.remove(4);
        System.out.println("HashMap after removing key 4: " + map);

        // Iterating over keysy using using keySet()
        System.out.println("Keys in HashMap:");
        for (int key : map.keySet()) {
            System.out.println(key);
        }

        // Iterating over values using values()
        System.out.println("Values in HashMap:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Iterating over key-value pairs using entrySet()
        System.out.println("Key-Value pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Checking if the HashMap is empty
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // Getting the size of the HashMap
        System.out.println("Size of HashMap: " + map.size());

        // Replacing the value for a specific key
        map.replace(2, "UpdatedAmit");
        System.out.println("HashMap after replacing key 2: " + map);

        // Clearing all elements from the HashMap
        map.clear();
        System.out.println("HashMap after clear operation: " + map);

        // Checking if the HashMap is empty after clear()
        System.out.println("Is HashMap empty after clear()? " + map.isEmpty());
    }
}
