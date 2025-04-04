public class reccursion {
    public static void printnum(int a)
    {
        if (a==10)
        {
           return ; 
        }
        System.out.println(a);
        printnum(a+1);

    }
    public static void main(String[] args) {
        int a =0;
        printnum(a);
    }
    
}
