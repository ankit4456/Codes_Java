// import java.util.*;
public class string_character_changing {
    public static void main(String[] args) {
        String hi  = "ocygen";
        char[] by = hi.toCharArray();  /*The toCharArray() method converts the String "ocygen" into a character array  */
        by[1] = 'x';
        String newwhai =  new String(by); /*/*Convert char[] to String by creating a new String object*/
        System.out.println(newwhai);
        
    }
    
}
