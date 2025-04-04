//take  the  2- array input and print the 2d array output taken by the user .
import java.util.*;
public class arrayuserinput2d {
    public static void main(String [] args)
    {
        Scanner sc = new  Scanner(System.in);
        System.out.println("enter the dimention of the matrix");
        int row  = sc.nextInt();       //taking the dimention of the array
        int coulumn = sc.nextInt();    //taking the dimention of teh array 

        System.out.println(" "); 


        int[][]  MAX = new int[row][coulumn];


         //this loop is to take array input and feed deta 
        for(int i = 0;i<row;i++)
        {
            for (int j=0;j<coulumn;j++)
            {
              MAX[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // and this array is for take out the feeded data 
        for (int i =0 ;i<row;i++)
        {
            for(int j =0;j<coulumn;j++)
            {
                System.out.print(MAX[i][j]);
            }
            System.out.println();
        }

        sc.close();

    }
    
}
