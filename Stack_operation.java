import java.util.Stack;  // also  insted of getting the whoile library we can also use the||--->>  import java.util.*;
public class Stack_operation {
    public static void main(String[] args) {
        Stack<Integer> hi  = new Stack<>();
        hi.push(2);
        hi.push(3);
        hi.push(4);
        // System.out.println(hi.peek());

        // System.out.println(hi.pop());
        // System.out.println(hi.pop());
        // System.out.println(hi.pop());
        System.out.println(hi);

        // System.out.println(hi.isEmpty());


       /*** want to copy all the element from one arrray to another */
        Stack<Integer> by  = new Stack<>();
        by.addAll(hi);
        
        System.out.println(by);




    }




    
}
