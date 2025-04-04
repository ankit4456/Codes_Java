import java.util.ArrayList;

public class Arrraylist_count_findkey {
    public static void main(String[] args) {
        
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(10);
        obj.add(20);
        int key = 10;
        int count   = 0;
        int value;
        /*inhenced for loop use kar ke key times count karna hai  */
        for(Integer m:obj)
        {
            if(m==key)    //it is like the pointers concept it will keeep traking of the index value with the count of the index 
            {
                value = m;
                System.out.println(value);
                count++;
               
            }
        }
       
        System.out.println(count);

    }
    
}
