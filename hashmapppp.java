/*basic hash map implimentataion */
import java.util.*;
import java.util.HashMap;

public class hashmapppp {

    public static void main(String[] args) {
        HashMap<Integer , String > hi =new  HashMap<Integer , String >();
         hi.put(101 , "c");
         hi.put(101 , "cpp");
         hi.put(101 , "java");
         hi.put(101 , "c");
         Scanner sc  = new Scanner(System.in);
         System.out.println("enter that key that you want ---->  " );
         int a = sc.nextInt();
         System.out.println(hi.get(a));
         
         /*try to apply ITERABLE IN IT FOR STRING SEARCHING */
       


         sc.close();
    
    }
    
}
