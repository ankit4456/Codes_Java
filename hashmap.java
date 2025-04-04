import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> sc = new HashMap<String, Integer>();

        sc.put("india", 120);
        sc.put("us", 30);
        sc.put("china", 150);
        sc.put("nepal", 130);

        System.out.println(sc);

        if (sc.containsKey("india")) {
            System.out.println("key is present");
        } else {
            System.out.println("key is not present");
        }

        if (sc.containsValue(120)) {
            System.out.println("value is present");
        } else {
            System.out.println("value is not present");
        }

        for (Map.Entry<String, Integer> e : sc.entrySet()) {
            System.out.print(e.getKey() + " ");
            System.out.println(e.getValue());
        }
    }
}