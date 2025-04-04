import java.util.*;

public class testt{
    public static void main(String[] args)
   {
       Scanner sc  = new Scanner(System.in);
       System.out.println("legth of the array---->");
       int n  = sc.nextInt();
       int[] a = new int[n];

       for(int i = 0;i<=n-1;i++)   //     
       {
           a[i]=sc.nextInt();

       }
       System.out.println("terget-->");

       int x = sc.nextInt();

       for(int i = 0;i<=n-1;i++)
       {
           if (a[i]>=x && a[i]<=x)
           {
               System.out.print(a[i-1]);
               System.out.print(a[i+1]);


           }

       }
       sc.close();


   }
}