public class Ascii {
    public static void main(String[] args) {
        char[] hi = {'a','b','c' , 'd' , 'a'};
        int a = 0;
        for(int i=1;i<hi.length;i++)
        {
           
            int l  = hi[i];
            int k = hi[i-1];
            System.out.println(l);
            System.out.println(k);


        }
    
    }
    
}
