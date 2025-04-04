import java.util.ArrayList;

public class contains_boolian_method {
public static void main(String[] args) {
    ArrayList<Integer>  hi = new ArrayList<>();
    hi.add(100);
    hi.add(200);
    hi.add(300);
    if(hi.contains(1000))  /* contains is the methos of the boolian class */
    {
        System.out.println("present");

    }
    else{
        System.out.println(" not present ");
    }
}    
}
