import java.util.*  ;  // here we are not importing specific class we are importing full class
public class testswitch {
    public static void main(String[] main)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your 1st input --->");

        int a = sc.nextInt();

        System.out.println("enter your 2nd input --->");

        int b = sc.nextInt();
        System.out.println("which operation do you want to perform? --->");

        int c = sc.nextInt();
        switch (c){
            case 1 : System.out.println(a+b);
            break;
        default: System.out.println("wrong entry");
        }

        sc.close();
    }
    
    
}
