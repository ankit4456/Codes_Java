import java.util.Scanner;

public class bitmnupulation_bitwise_and {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number and cheak it is even or odd-->");
        int n = sc.nextInt();
        if((n&1)==1)
        {
            System.out.println("odd");
        }
        else
        {
            System.out.println("even");
        }
        sc.close();

    }
    
}
