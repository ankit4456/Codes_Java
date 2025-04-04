import java.util.ArrayList;

public class inhanced_forloop_add_all_element {
    public static void main(String[] args) {
         ArrayList<Integer> hi  = new ArrayList<Integer>();
         hi.add(1);
         hi.add(2);
         hi.add(3);
         /* using for loop for addition and  it is posible  */
         int b=0;
         for(Integer by:hi)
         {
              b = b+hi.get(by-1);
         }
         System.out.println(b);
    }
    
}
