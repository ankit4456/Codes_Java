/*Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
 */
import java.util.*;

public class stringreplacement{
    public static void main (String[] main)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter your name --->");
        String  name  = sc.nextLine();


        String result = name.replace("i", "e");
         System.out.println(result);




         
         sc.close();

    }
}
