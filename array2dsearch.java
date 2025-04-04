//make a 2d array by taking user iinput and   take the input among the user and find  the index location of taken input
import java.util.*;
public class array2dsearch {
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
        System.out.println("enter the element to be searched--->");
        int x = sc.nextInt();

        // and this array is for take out the feeded data 
        for (int i =0 ;i<row;i++)
        {
            for(int j =0;j<coulumn;j++)
            {
                if (MAX[i][j]==x)
                {
                    System.out.print(i);
                    
                    System.out.print(j);

                }
            }
            System.out.println();
        }

        sc.close();

    }
    
}
