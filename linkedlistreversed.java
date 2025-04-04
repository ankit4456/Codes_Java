import java.util.Collections;
import java.util.LinkedList;

public class linkedlistreversed 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> reversed = new LinkedList<>();
        reversed.add(1);
        reversed.add(2);
        reversed.add(3);
        reversed.add(4);
        System.out.println(reversed);

        Collections.reverse(reversed); // this collection used for reversing 

        System.out.println(reversed);


            
        }
    
}
    
    
