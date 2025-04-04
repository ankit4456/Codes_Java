import java.util.* ;

public class Sum {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a --->" );
        int a = sc.nextInt();
        System.out.println("enter value of b --->" );
        int b = sc.nextInt();
        System.out.println("sum of the both the numbers is---->" + (a+b));
        if ((a+b)<90)
        {
            System.err.println("false");
        }


        sc.close();  

    }
    
}
    
