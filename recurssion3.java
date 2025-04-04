public class recurssion3 {

    public static void printnum(int  n , int sum)
    {
        if (n==0)
        {
            System.out.println(sum);


            return ;
        }
        sum = sum +n;
        printnum(n-1 , sum);
    }

    public static void main(String[] args){
    
        int n =5;
        int sum = 0;
        printnum(n ,sum);
    }

    
    
}
