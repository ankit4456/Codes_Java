public class stack_operation_using {
    public static void recuession(int a)
    {
        if(a==9)
        {
            System.out.println(a);
            recuession(a++);
        }
    }
    public static void main(String[] args) {
        int a = 1;
        recuession(a);

    }
    
}
