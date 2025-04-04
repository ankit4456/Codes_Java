import java.util.*;
public class linkedlistadd {
    public static void main (String [] args )
    {
        Scanner sc  = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();  // writing <String> again is optional.

        System.out.println("emter your elements---->");
        int n   = sc.nextInt();

         for(int i=0;i<=n-1;i++)
         {
          list.add(sc.nextInt());
           
          
         }
         System.out.println(list);

         sc.close();
    }
    
}
