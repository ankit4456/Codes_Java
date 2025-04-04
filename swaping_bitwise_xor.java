public class swaping_bitwise_xor {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

       // Using XOR operation
        a = a ^ b;  // a becomes 15 (binary: 0101 ^ 1010)----15
         b = a ^ b;  // b becomes 5 (binary: 1111 ^ 1010)
a = a ^ b;  // a becomes 10 (binary: 1111 ^ 0101)

System.out.println("a: " + a);  // Output: 10
System.out.println("b: " + b);  // Output: 5
    }
    
}
