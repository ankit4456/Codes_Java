import java.util.*;

public class arrayfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Example array
        int[] arr = {1, 2, 3, 1, 2, 4};

        Map<Integer, Integer> A = new HashMap<>();

       
        for (int i = 0; i < arr.length; i++) {
            
            if (A.containsKey(arr[i])) {
                A.put(arr[i], A.get(arr[i]) + 1);
            } else {
                A.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : A.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }

        sc.close();
    }
}
