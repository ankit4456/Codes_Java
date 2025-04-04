import java.util.Scanner;
public class character_array {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter your length--->");
        int n = sc.nextInt();
        
        /*character array */
        char[] hi = new char[n];
        for(int i = 0;i<n;i++)
        {
             hi[i] = sc.next().charAt(0); // here i feed zero bcz every time  it make one index and fill with the ghelp od sc.next() thing //
            
        }
        // System.out.println(hi);
        for(char  ass:hi)
        {
            System.out.printf(ass +"->");
        }
        {

        }
        

        sc.close();
        
    }
    
}
