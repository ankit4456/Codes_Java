class hi{
    public void addd( int a , int b)
    {
        int d = a*b;
        System.out.println(d);
    }
}
public class method {
    public static void add(int a, int b)
    {
        int c = a*b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        int a=10;
        int b=3;
        method.add(a,b);

      hi h = new hi();
      h.addd(a , b);

        
    }
    
}
