public class recurssion1 {

    public static void printnum(int n)
    {
        if (n==0)           //base condition to exit , if you do not have the base method then at some point of time the stack is over flow due to  full memory consumption  for every operation the recurssion object "n" takes new space in the stack memory         
        {
            return ;
        }
         System.out.println(n);
         printnum(n-1);
    }
    public static void main(String[] args)
    {
        int n = 5;
        printnum(n);
    }
    
}
