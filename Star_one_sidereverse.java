public class Star_one_sidereverse {
    public static void main(String[] args) {
        for(int i=1 ; i<=7;i++)
        {
            for(int j = 1 ; j<=8-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        ////**reverse */
        for(int i=1 ; i<=6;i++)
        {
            for(int j = 1 ; j<=i+1;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
