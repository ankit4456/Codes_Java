import java.util.*;
public class Switech {
    public static void main(String[] args ){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your choice -->");
        int a = sc.nextInt();

        switch(a){

        case 1 : System.out.println("hi");
        break ; 

        case 2 : System.out.println("hello ");
        break ; 

        case 3 : System.out.println("namaste");
        break ; 

        default: System.out.println("wrong entry");

        }

         sc.close();
         
        }
    }
    

