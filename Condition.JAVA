import java.util.*;

public class Condition{
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("enter your age----->");
    int age = sc.nextInt();
    if(age>18)
    {
        System.out.println("yes he is adult");
    }
    else
    {
        System.out.println(" not an  adult");

    }
    sc.close();
    }
}