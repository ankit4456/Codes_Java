import java.util.*;
public class sumusingloop {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i =1;i<=10;i++){
            
            sum = sum+(n*i);   //sum of a table 
            


        }
        System.out.println(sum);
            
        
        
sc.close();
    }
    
}