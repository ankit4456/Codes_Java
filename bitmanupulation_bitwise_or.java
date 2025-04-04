public class bitmanupulation_bitwise_or {
    public static void main(String[] args)
    {
        /*Setting Specific Bits: */
        
        int num = 5;  // Binary: 0101
        int mask = 4; // Binary: 0100 (sets the 3rd bit)
        int result = num | mask; // Binary: 0101 | 0100 = 0101 (5 | 4 = 5)
        System.out.println(result); // Output: 5


        /*Combining Flags: */

        int READ = 1;    // Binary: 0001
        int WRITE = 2;   // Binary: 0010
        int EXECUTE = 4; // Binary: 0100

        int permissions = READ | WRITE; // Binary: 0001 | 0010 = 0011 (3)
        System.out.println(permissions); // Output: 3

        /* Merging Data: */

        int red = 0xFF0000;   // Red color channel
        int green = 0x00FF00; // Green color channel
        int combined = red | green; // Combines red and green
        System.out.println(Integer.toHexString(combined)); // Output: ffff00

        /*random observation */

        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011
        int resultt = a | b; // Binary: 0111 (7)
        System.out.println(resultt); // Output: 7
    }
    
}
