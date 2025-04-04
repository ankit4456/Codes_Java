import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class string_num_comparision {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        String hi = "453";
        {
            int hii = Integer.parseInt(hi);
            int by  = hii;
            System.out.println(hii);
            while(hii!=0)
            {
                int l  = hii%10;
                obj.add(l);
                hii = hii/10;
            }

          obj.get(by);
            Collections.sort(obj);  
            for(int i=obj.size()-1;i>=0;i--)
            {
                if(obj.get(i)%2==1)
                {
                    System.out.println(obj.get(i));
                    break;
                }
                else{
                    System.out.println("even");
                }
            }
            }
        }
    }
