import java.util.*;

public class perfectsquare{

    public static int perf(int n1 , int n2)
    {
        for(int i = 1; i*i<=n2 ;i++)
        {
            if(i*i>=n1)
            {
                System.out.println(i*i);
            }
            else 
            {
                System.out.println("invalid iinput ");
            }
        }
        return 1;
    }



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter thr 1st num --->");
        int n1  = sc.nextInt();
        System.out.println("enter thr 2nd num --->");
        // System.out.println("");
        int n2  = sc.nextInt();


        System.out.println("");

        perf(n1 , n2);  //function calling 

        sc.close();


    }

}