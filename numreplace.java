import java.util.*;
public class numreplace {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number");
        int num = sc.nextInt();
         

       String number = Integer.toString(num);
       String replacee = number.replace('0' ,'1');
       System.out.println(replacee);





       sc.close();


    }
    
}
