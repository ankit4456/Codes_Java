public class opposite_pyramid {
    public static void main(String[] args) {
        for(int i=1 ; i<=7 ;i++)
        {  
            for(int j=1; j<i;j++)
            {
                System.out.print(" ");
            }
           
            for(int k=1; k<=7+1-i;k++)
            {
                System.out.print(k+" "); //<<<<<----this space will do all the thing
            }
            System.out.println();
        }
        for(int i=1 ; i<=6 ;i++)
        {  
            for(int j=1; j<=6-i;j++)
            {
                System.out.print(" ");
            }
           
            for(int k=1; k<=i+1;k++)
            {
                System.out.print(k+" ");   //<<<<<---- and this space will do all the thing
            }
            System.out.println();
        }
    }
    
}
