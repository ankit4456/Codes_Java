import java.util.ArrayList;
// import java.util.Collections;
import java.util.Scanner;


public class linkedlis {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(6);
        list.add(7);

        //  int k = Collections.binarySearch(list , 4);
        //  System.out.println(k);
        int temp=0;
        for(int i=0;i<=list.size()-1;i++)
        {
            if (list.get(i)==k)
            {
                System.out.print(i + " ");
                temp=temp+1;
            }
            
        }
        System.out.print("\n");
        System.out.println("frequency is -->"+ temp);


    }
    
}
