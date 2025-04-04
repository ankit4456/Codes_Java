import java.util.*;
public class iterator {
    public static void main(String[] args) {
        ArrayList<String> hi = new ArrayList<String>();
        hi.add("ankit");
        hi.add("aman");
        hi.add("mahendra");
        /* using simple loop  */
        for(int i=0;i<hi.size();i++)
        {  
            System.out.println(hi.get(i));

        }
        /*inhenced for loop */
        for(String m:hi)
        {
            System.out.println(m);
        }
        /* itterator */
        Iterator<String> so = hi.iterator();
        while(so.hasNext()){
            System.out.println(so.next());
        }
         
    }
    
}
