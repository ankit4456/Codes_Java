import java.util.HashSet;
import java.util.*;
public class AScii_valurofchar {
    public static void main(String[] args) {
       
     String hi = "abcdakit";
     char[] lol  = hi.toCharArray();
     
     for(int i=0;i<lol.length;i++)
     {
        System.out.println(lol[i]);
     }


     HashSet<Character> by   = new HashSet<Character>();
     for(int i = 0 ;i<lol.length;i++)
     {
        by.add(lol[i]);
     }
     ArrayList<Character> copy = new  ArrayList<Character>(by);
     char[] ch = new char[copy.size()];
     for(int i=0;i<copy.size();i++)
     {
        ch[i] = copy.get(i);
     }
     Arrays.sort(ch);
     int a = 0;
     for(int i=1;i<ch.length;i++)
     {
        if(ch[i]-ch[i-1]==1)
        {
              a = a+1;
        }
     }
     System.out.println(a+1);
    }   
    
}

