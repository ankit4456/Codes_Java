/* Take an array of Strings input from the user & find the cumulative (combined) length of all those strings. */
import java.util.*;
public class arraystring {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("size of the string-->");
       int size = sc.nextInt();

       String name[] = new String[size];
       int totLength = 0;

       for (int i = 0 ; i<size ; i++)
       {
            name[i] = sc.next();
            totLength = totLength+name[i].length();
          
       }
       System.out.println(totLength);  // to find the size we can use this 


       System.out.println(size);   // also to find the size we can use this 
       sc.close();
    }
}
