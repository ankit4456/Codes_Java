import java.util.Arrays;
import java.util.Scanner;

public class binary_real_search {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);  //taking user input of unsorted arrays  with n umber of size
        int size =sc.nextInt();
        int[] array = new  int[size];

        for(int i = 0;i<=array.length-1;i++){
            array[i] = sc.nextInt();
        }
        
       Arrays.sort(array); //sorting it with the function called -->> Arrays.sort(array)   // and it is one of the function of the array library
       System.out.println(Arrays.toString(array));  

       /* now my array i ssorted here we have to perform the binary search */
       int start = 0;
       int end =array.length-1;
       int mid;
       System.out.println("enter index element found --->");
       int k =sc.nextInt();

       while (start<=end)
       {
        mid  = start+(end -start)/2;

        
        if (array[mid] == k)
        {
             System.out.println("your element is at the -->" + mid);
             break;
             
           
            
        }

        else if ( array[mid]<=k)
        {
            start = mid + 1;
            
            
            
        }

        else 
        {
            end = mid -1;
           
            
        }

       

       }

    //    System.out.println("invalid inout");
    //    return 0 ;       


    sc.close();
    }
    
}
