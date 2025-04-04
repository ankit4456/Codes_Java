public class reccursionfactorial {
    public static int printfact(int n )
    {
        if(n == 1||n == 0)
        {
            return 1;
        }

        int  fact1  = printfact(n-1);
        int fact2 = n*fact1;
        // System.out.println(fact2);
        return fact2;
    }
    public static void main(String[] args )
    {
        int n = 5;
       int result =   printfact(n);     //isme value stored hai matlb printfact me humko print ke andar laa ke iska value print karana hoga
       System.out.println(result);
    //   printfact(n);
    }
    
}
