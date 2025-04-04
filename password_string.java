import java.util.*;
public class password_string {
    public static void main (String[] args)
    {
       Scanner sc  = new Scanner (System.in);
       System.out.println("enter your password--->");
       String pass = sc.nextLine();
    //    String kato = pass.substring(i, );
    for (int i=0;i<=pass.length();i++)
    {
        if (i>3)
        {
            System.out.println("your passsword is correct");
        }
        else 
        {
            System.out.println("your pass word is not correct");
        }
    }
    sc.close();

    }
    
}
