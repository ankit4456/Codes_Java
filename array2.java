//here problem statement is to take an array input and print the index rank that which  is chossen by the user.
import java.util.*;
public class array2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  //constructor 
        System.out.println("enter the array size----->");
        int size  = sc.nextInt();

        int arr[] =  new int[size];  //defining array another type when you want array as argument 
        
        System.out.println(" ");

        //input 
            for(int i = 0 ; i<size;i++)
            {
                arr[i]  = sc.nextInt();
                
            }
            // int x = sc.nextInt();
            System.out.println("enter the searched element--->");
            // System.out.println(" ");

            int x = sc.nextInt();

        // display
            for(int i = 0 ; i<size;i++)
            {
               if(arr[i] == x)
               {
                System.out.println("the item is at "  + i  + " index");
               }
            }
            
           
        
            
            
        
        sc.close();

    }
    
}
