public class Starpattern {
    public static void main(String[] args) {
    //**first half logic  */
        for(int i = 1;i<=5;i++)
        {
            for(int j = 1;j<=5-i;j++)   // ye to pura chall hi raha hai hum kyu confuse ho rahe hai 
            {
                System.out.print(" ");
            }
           
            for(int k = 1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }

      //** second half logic  */
        for(int i = 1;i<=4;i++)
        {
          for(int j=1 ; j<=i ; j++)
          {
            System.out.print(" ");  // for space 
          }


          for(int k=i ; k<5 ; k++)  //jab ye 5 hoga to sirf stars print karega 
          {
            System.out.print("*");
          }
          System.out.println();
          

        }
    }

    
}
