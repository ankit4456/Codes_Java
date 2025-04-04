//here we can sort the array with the builtin method 

import java.util.Arrays;

public class array_sort {
    public static void main(String[] args)
    {
        int[] arr = {3,4,5,5,2,4,2,8,97,6,5,4,};
        Arrays.sort(arr);     //inbuilt library to sort the array
        System.out.println(Arrays.toString(arr));    //this statement prints the string value so when i pas the array it will give the garbage value so we have tto typecast to the integer before going to print //


        /*count the size */
      int size = arr.length;
      System.out.println(size);

      /*finding the highest */
     
      int lastindex = arr.length-1;
      System.out.println("this is your highest digit in the array-->" +arr[lastindex]);
       
      
      

      
      
    }
    
}
