/* WideningTypeCastingExample.java */
public class typecasting {
    public static void main(String[] args) {
        int a = 8;
        System.out.println(a);
        long  b = a; /* 4bytes stores in 8 bytes  */
        System.out.println(b);
        float c = b; /* here 8 bytes stores in 4 bytes */
        System.out.println(c);

        /* finding the length of the given number  */
        int p = 12345;
        int digit = String.valueOf(p).length();
        System.out.println(digit);
    }
    
}
