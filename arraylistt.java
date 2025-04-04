// import java.util.ArrayList;
import java.util.*;

// import java.util.Collections;
class arraylistt {
    // import java.util.Arraylist;
    public static void main(String[] args )
    {
        ArrayList<Integer>  list  = new ArrayList<Integer>();     //defining array list

        /*this is for adding the value  for the list  */

        list.add(0);   //array list only store the object 
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        /*get elements  */

        int x = list.get(1);
        System.out.println(x);

        /* add elementgs */
       list.add(1,3);     //here the elements will be addded by making one index 
       System.out.println(list);

       /*set elements */
       list.set(0,5);    // here the elements will be set by replacing at that index
       System.out.println(list);

       /*delete elemnts */
       list.remove(0);
       System.out.println(list);

       /*size of the element  */
       int l = list.size();
       System.out.println(l);

       /*loops  */
       for(int i = 0;i<=list.size()-1;i++)
       {
        System.out.print(list.get(i));
       }
       /* sorting */
      Collections.sort(list);
      System.out.println(list);
    }
}
    

