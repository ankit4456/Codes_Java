public class fibonacci_simple_way {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(a);
        int b =1;
        System.out.println(b);
         for (int i = 2;i<=7;i++)
         {
            int c = a+b;
             a=b;
             b=c;
             System.out.println(c);
         }
    }
    
}
