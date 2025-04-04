import java.util.Scanner;

public class function_sum {

    public static int add(int a , int b)
    {
        int  sum = (a+b);
        System.out.println(+ sum);
        return 1 ;

    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        add (a , b); //made a function and then call it 
    
        sc.close();
    }
    
}
