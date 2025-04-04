//sorry this is linear search //
import java.util.Scanner;

public class binary_search {

    public static int search(int[] nums, int target) {

        for(int i =0;i<=nums.length-1;i++)
         {
            if (nums[i]==target)
            {
                System.out.println(i);
                
            }

            // System.out.println("invalid input");
            // return -1 ;
            

         }
         System.out.println("invalid input");
         return -1 ;    // this is used when you want to print the invalid input
        
    }
    public static void main(String[] args)
    {
        int[] nums = {-1,0,3,5,9,12};  //there is alreadythe array value is feeededd ao we just have to scan the value with the array index
        
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        
        search(nums , target);
        sc.close();
         
    }
} 
    

