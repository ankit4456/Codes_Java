import java.util.*;

public class function_average {
    public static int average(int a , int b ,int c)
    {
        int avg  = (a+b+c)/3;
        System.out.println(avg);
        return 1;
    }
    public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    int a  = sc.nextInt();
    int b  = sc.nextInt();
    int c = sc.nextInt();

    average(a , b , c);
    
    sc.close();

}

}