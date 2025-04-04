public class bitmanupulation_bitwise_exlusive_or {
    public static void main(String[] args) {

        /*Swapping Two Numbers Without a Temporary Variable */
        int a = 5;
        int b = 3;

        a = a ^ b; // a = 5 ^ 3 = 6
        b = a ^ b; // b = 6 ^ 3 = 5
        a = a ^ b; // a = 6 ^ 5 = 3
                        
       System.out.println("a: " + a); // Output: a: 3
       System.out.println("b: " + b); // Output: b: 5
    }
    
}
