import java.util.Collections;
import java.util.LinkedList;

public class linkedlistreverse {
    public static void main(String[] args)
    {
        // LinkedList<Integer> list  = new LinkedList<>(Arrays.asList(1,2,3,4,5,5,3,2));   //Arrays.asList(1,2,3,4,5,5,3,2(collection framework)
                LinkedList<Integer> list  = new LinkedList<Integer>();
                {
                    list.add(1);
                    list.add(2);  //add the element at last
                    list.add(3);
                    list.push(9);  //add the element at first 
                    int n = list.pop();
                    System.out.println(n);
                    int m = list.pop(); 
                    System.out.println(m);
                    System.out.println(list);
                   
                }
                // Collections.reverse(list);
                // System.out.println("reversed list->" + list);

                // int x = list.getFirst();     // getFirst() --> type of collection frameworks 
                // System.out.println(x);

                // int y  = list.getLast();
                // System.out.println(y);

            




        {

        }
    }
    
}
