import java.util.*;

public class calculator{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your value-->");
        int a = sc.nextInt();
        System.out.println("enter your value-->");
        int b = sc.nextInt();
       int c = sc.nextInt();

        switch(c)
        {
            case 1 : System.out.println("you sellected plus-->" + (a+b));
            break;

            case 2 : System.out.println("you sellected multiply-->" + (a*b));
            break;

            case 3 : System.out.println("you sellected subtract--> " + (a-b));
            break;

            case 4 : System.out.println("you sellected modulo--> " + (a%b));
            break;

            default: System.out.println("wrong entry ");

        }

   sc.close();
   
    }
}