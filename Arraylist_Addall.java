import java.util.*;
public class Arraylist_Addall {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(100);
        obj.add(200);
        obj.add(300);


        ArrayList<Integer> obj1 = new ArrayList<>();
        obj1.add(100);
        obj1.add(200);
        obj1.add(300);

        /* this ti to use this thing */
        obj.addAll(obj1);
        System.out.println(obj);

       /* HashSet is the extended class of the  class implementation of the set interface // or say that set is the interface of the */
        HashSet<Integer>  hi  = new HashSet<>(obj1);
        {
            System.out.println(hi);
        }


    }
    
}
