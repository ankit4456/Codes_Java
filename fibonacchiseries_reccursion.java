public class fibonacchiseries_reccursion {
    public static void fibonacchiseries(int m ,int n1, int n2)
    {
        if(m==11)
        {
            return;
        }
        int n3 = n1+n2;

        // System.out.println(n1);
        // System.out.println(n2);

       
        fibonacchiseries(m+1 ,n2 ,n3);
        System.out.println(n3);
        

    }
    
    public static void main(String[] args)
    {
        int n1 = 0;
        int n2 = 1;
        int  m  = 0;
        fibonacchiseries(m ,n1, n2);
    }
    
}
