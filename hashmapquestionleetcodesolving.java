import java.util.HashMap;
import java.util.Map;

public class hashmapquestionleetcodesolving {
    public static void main(String[] args) {
        // Initialize the array
        int[] nums = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        
        // Create a map to store the frequency of each number
        Map<Integer, Integer> hi = new HashMap<>();

        // Iterate through the array to count the frequencies
        for (int i = 0; i < nums.length; i++) {
            // If the number is already in the map, increment its frequency
            if (hi.containsKey(nums[i])) {
                hi.put(nums[i], hi.get(nums[i]) + 1);
            } else {
                // If the number is not in the map, add it with frequency 1
                hi.put(nums[i], 1);
            }
        }

        // Print the frequency map to see the result
        System.out.println("Frequency Map: " + hi);
    }
}
