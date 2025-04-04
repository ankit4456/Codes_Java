import java.util.HashMap;
import java.util.ArrayList;

public class HAshhhmapp {
    public static void main(String[] args) {
        HashMap<Integer , Integer> by = new HashMap<Integer , Integer>();
        int[] hi = {1,3,3,4,5,2,4,4,5,3,2,1,4,5,6,5,5,5,5,5,5,5,5,5};
        
        for(int i=0;i<hi.length;i++)
        {
            
            if(!by.containsKey(hi[i]))  // this cotainsakey will return the boolen value ...
            {
                by.put(hi[i],1);
                
            }
            else{
                by.put(hi[i] ,by.get(hi[i])+1);
            }
        }
        System.out.println(by.entrySet());






    //     /*finding max */
    //     int m=-1;
    //    ArrayList<Integer> lol = new ArrayList<Integer>(by.values());
    //    for(int i=0 ; i<lol.size();i++)
    //    {
    //       m = Math.max(m,lol.get(i));
    //    }
    //    System.out.println(m);
       
    }
    
}
