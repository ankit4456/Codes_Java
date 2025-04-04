import java.util.*;
public class function_multiply {
    public static int multiply (int a , int b)
    {
        int mul = (a*b);
        System.out.print(mul);
        return 1;

    }
    public static void main(String[] args)                                      
    {
       Scanner  sc = new Scanner(System.in);
       System.out.print("enter 1st number:->");
       int a = sc.nextInt();
       System.out.print("enter your second number :->");
       int b = sc.nextInt();

        multiply (a ,b); //calling function by iobject passing 
        /**  System.out.println("here the function call" ,  + multiply (a ,b));   ---->//method PrintStream.println() is not applicable
      (actual and formal argument lists differ in length)*/
        
        sc.close();
 
    }
    
}
