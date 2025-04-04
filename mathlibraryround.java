public class mathlibraryround {
    public static void main(String[] args) {
        double  a = 44.44;
        System.out.println(a);
        int c = (int)Math.round(a);  /*it can make round value  */
        System.out.println(c);



        /* to find the floor value --it takes always low value */
        double b = 2.5;
        int d=(int)Math.floor(b); // expected give 2
        int g= (int) Math.ceil(b);
        System.out.println(d);
        System.out.println(g);


        /*to find the ceil value-- it takes always higher value */
        double f = -2.3;
        int e= (int) Math.ceil(f);
        System.out.println(e);
        


    }
    
}
