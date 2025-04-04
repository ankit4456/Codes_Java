import java.util.*;

public class oddeven {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter your first number;");
        int a = sc.nextInt();
        System.out.println("enter your second number;");

        int b = sc.nextInt();
        if ( a%b == 0 )
        {
            System.out.println("divisible ");
        }
        else
        {
            System.out.println("not divisible");
        }
        sc.close();
    }
}
