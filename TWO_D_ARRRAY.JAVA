import java.util.Scanner;
public class TWO_D_ARRRAY{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i= sc.nextInt();
        int j = sc.nextInt();
        int[][] hi = new int[i][j];  // it take memory space as a metrix in the heap memory 
        for(int l = 0;l<i;l++)
        {
            for(int k = 0;k<j;k++)
            {
                hi[l][k] = sc.nextInt();
            }
        }

        for(int l = 0;l<i;l++)
        {
            for(int k = 0;k<j;k++)
            {
               System.out.print(" ["  + hi[l][k] + "] ");
            }
            System.out.println();   
        }


        sc.close(); 
}
}