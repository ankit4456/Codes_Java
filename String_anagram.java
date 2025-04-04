import java.util.Arrays;
public class String_anagram {
    public static void main(String[] args) {
         String s= "ankit";
         System.out.println(s);
         String y = "takin";
         System.out.println(y);



         char[] ch = s.toCharArray();
         char[] sh = y.toCharArray();



        Arrays.sort(ch);
         System.out.println(ch);


        Arrays.sort(sh);
        System.out.println(sh);

        
        /*convert back to string  */
     String sortedS = new String(ch);
     String dedo = new String(sh);

        if(sortedS.equals(dedo))
        {
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }

    }
    
}
