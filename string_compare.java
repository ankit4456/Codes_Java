import java.util.*;
public class string_compare {
    public static void main (String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first string :--->");

        String name1 = sc.nextLine();

        System.out.println("enter your second string :---->");
        String name2 = sc.nextLine();

        if(name1.compareTo(name2)==0)     // here the  (name1.compareTo(name2)==0)   >>>> (compare.To) String  used to compare between two  strings 
        {
            System.out.println("string matched");
        }
        else 
        {
            System.out.println("string does'nt matched");
        }

        sc.close();
    }
    
}
