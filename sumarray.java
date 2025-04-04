import java.util.*;
public class sumarray {
    public static void  main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int length  = sc.nextInt();
        int[] array = new int[length];
        int temp  = 0;

        for(int i  = 0;i<=array.length-1;i++)
        {
           array[i] = sc.nextInt();
           
        }


        for(int i = 0;i<=array.length-1;i++)
        {
         
        int  temp1 =array[i];
        temp = temp + temp1;   //if we can not take the each value in print and try to take print out side of the class then it will give the last returned value 
       


        }
        System.out.println(temp);
       
sc.close();
    }
    
}
