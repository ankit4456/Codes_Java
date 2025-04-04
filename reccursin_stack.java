public class reccursin_stack {
    /* recursion  */
    public static void reading(int a)
    { 
        if(a==10)  //base class
        {
            return;
        }
        
            
            reading( a+1);  // update the condition
            System.out.println(a);  // reccursionuses the stack operation  to store the data 

    }
    public static void main(String[] args) {
        int a=0;
        reading(a);

    }
    
}
