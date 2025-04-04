/* the discription of the above code is ek string lie hai our usko kat ke our user
 se input keke match kar rahe hai output return kara rahe hai*/
import java.util.*;
public class substring {
    public static void main(String[] args )
    {
        Scanner sc   = new Scanner(System.in);
        System.out.println("enter your string --->");

        String x = sc.nextLine();
        String name = "My_name_is_gupta";
        String kato = name.substring(6 , 10);   // here the______.substring(startingcut  , endingcut);  _____ is used  to kato aour nikaloo string  concept in java  

            if (x.equals(kato)) // _.equals(_)   here is a method we can usng insted of this ==
            {
             System.out.println("bhadwa");
            }
            else 
            {
            System.out.println("not a bhadwa");
            }
 sc.close();

    }
    
}
