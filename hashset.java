import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> firsttime = new HashSet<Integer>();
        firsttime.add(1);
        firsttime.add(2);
        firsttime.add(3);
        firsttime.add(4);
        firsttime.add(1);
        /* cheaking duplicacy */
        
        System.out.println(firsttime);


        if(firsttime.contains(2))  /*used for inserting*/
        {
            System.out.println("1 is present ");

        }
        else
        {
            System.out.println("it is not there ");
        }



        firsttime.remove(1);  /* used to remove */
            System.out.println(firsttime);



        /* Use of ITERATOR */
        Iterator hi = firsttime.iterator();
         while(hi.hasNext())   /* is ka matlab hai jab tak sahi hai */
         {
            System.out.println(hi.next());   /* next index print kar */

         }




    }
}