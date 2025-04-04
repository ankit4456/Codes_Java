//   suppose want o find the factorial of n with out multifliying  3+2+1
import java.util.*;
public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=n;i>=0;i--)
        {
            System.out.println(n*i);
        }
sc.close();
    }
    
}
