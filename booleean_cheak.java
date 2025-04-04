import java.util.Scanner;  /* when you want an specific library the you have not to use thsi ".*" thing  */
public class booleean_cheak {
    public static void main(String[] args) {
        boolean cheak;
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter the size you want-->");
        int n = sc.nextInt();
         
        System.out.print("enter the array-->");
        int[] ank = new int[n];
        for(int i=0;i<n;i++)
        {
            ank[i]=sc.nextInt();
        }


        System.out.println("------raading the array---------");


        for(int i=0;i<n;i++)
        {
           System.out.println(ank[i]);
        }


        for(int i=1;i<n;i++)
        {
            cheak=(ank[i-1]<ank[i]);
            if(cheak)
            {
                System.out.println("koi dikkat nahi hai ");
            }
            else{
                System.out.println("dikkat to hai bhainaa ");
            }
        }
        


      
        sc.close();
    }
    
}
