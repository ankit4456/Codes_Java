// import java.util.Scanner;  //importing the specific library 
public class TWO_D_array {
    public static void main (String[] args)
    {
        // Scanner sc = new Scanner(System.in);
        
        {
            int[][] twodimension  = new int [2][2];  // here array declare with name and we are not using array as a function 
            twodimension[0][0] = 2;
            twodimension[0][1] = 3;

            twodimension[1][0] = 3;

            twodimension[1][1] = 2;
            
            for(int i =0 ; i<twodimension.length ; i++)
            
            {
                for (int j =0 ; j<twodimension[i].length;j++) //yaha i row me hi stick kar ke row ka data read karega
                {
                    System.out.print(twodimension[i][j]  + " ");

                }
                System.out.println();

            }
            System.out.println(twodimension.length);


        }
        // sc.close();
    }
    
}
