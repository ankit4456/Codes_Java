import java.util.*;
public class function_name{

    public static void my_name(String name)  //data feeded
    {
        System.out.println(name);   
        return;
    }
    public static void main(String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();  //data taken 

    
        my_name(name); //calling

       sc.close();   //closed scanner class

    }
}