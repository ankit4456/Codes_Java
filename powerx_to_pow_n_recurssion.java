import java.util.*;

public class powerx_to_pow_n_recurssion {
    public static int powervalue(int x , int n)
    {
        if (x==0)
        {
            return 0;
        }
        if (n ==0)
        {
            return 1;
        }
        
       
      int value1 =   powervalue(x, n-1); // here the 5 is there for the every iteration and the power will be decreasion 
      int  value2 = x * value1;   // by multiplying x it will indicate that the value1 ka sirf x walla part hi iuse karna hia multipphy ke lie 
      return value2;   // the last value is returned to the powervalue ressursive function 
       


    }
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);

        System.out.println("enter your base -->");
        int x = sc.nextInt();

        System.out.println("enter your pow-->");
        int n =sc.nextInt();

       int temp = powervalue( x , n);  // ressusive function declaration and value passing by taking iinput in " x " and " n "

       System.out.println(temp);

        sc.close();
    }
    
}
