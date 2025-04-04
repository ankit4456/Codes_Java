import java.util.Arrays;

public class Arrays_join {
    public static void main(String[] args) {
        int[] hi = {1, 2, 2, 3, 4, 4, 4};
        int[] by = {1, 2, 3, 4, 4, 4, 4};

        // Create a new array of size hi.length + by.length
        int[] adding = new int[hi.length + by.length];

        // Copy elements from 'hi' to 'adding'
        System.arraycopy(hi, 0, adding, 0, hi.length);
        
        // Copy elements from 'by' to 'adding' at the correct position
        System.arraycopy(by, 0, adding, hi.length, by.length);

        // Print the merged array
        System.out.println(Arrays.toString(adding));
    }
}
