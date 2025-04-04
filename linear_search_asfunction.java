import java.util.Scanner;  //import specific library

public class linear_search_asfunction
{
    public static void  linearsearchfunction(int[] arr , int target)
    {
     for(int i = 0 ; i<arr.length-1;i++)
     
        if(arr[i] ==target)
        
       {
        System.out.println("at"+ i +"is the index posiotion");
      
        
       }
        

       
       
       

    }
    public static void  main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,5,6,7};

         Scanner sc = new Scanner(System.in);
         System.out.println("enter your target---->");

        int target  = sc.nextInt();


        linearsearchfunction(arr , target);
            
            
        
       sc.close();     

    }
   
    
}
    

