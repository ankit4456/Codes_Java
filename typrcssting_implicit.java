/* in implicit compiller autometacally do it  */
public class typrcssting_implicit {
    public static void main(String[] args) {
        /* in implicit typr casting we can store the lower capacity deta type to larger capacity deta type */
        /*for example---> */
         int a=3;  // integer is of 2 bytes ----aka ----16bits deta storage//
         double b=a;   // assigned to the lower deta type in the higher bucket //
         System.out.println(b);




         /* in explicit compiller doesnot do autometacally */
         double c =4.8;
         int d =  (int)c;  /*choote ko bada assign kar rahe hai but explicitly */
         System.out.println(d);  /*yes deta will be loosed --output is 4*/

         /*ankother example */
         int e =33;
         int f =44;
         int g=(int)Math.pow(e,f);  /*the math function return the value in double type so i have to explicitly convert it in to the integer  */
         System.out.println(g);

         /* agar hum explicit type casting nahi karna 
          * chahte hai to humko Math.pow --chalane ke lie pehele se hi double me lena hoga 
          ya for manmana output lene ke lie humko  explixit casting karna hi hoga 
          */
          double h = Math.pow(e,f);
          System.out.println(h);
          int i = (int)h;
          System.out.println(i);

          /* for square */
        //   int j=9;
        //   double k=Math.sqrt(j);
        //   System.out.println(k);

          /*doing same square with anothermethod */
          int j=9;
          int  k= (int)Math.sqrt(j); /*float explicitly converted to the integer */
          System.out.println(k);

          /* for cube root */
        //   int l=27;
        //   double m= Math.cbrt(l);
        //   System.out.println(m);

        /*doing same thing with another method */
        int l=27;
        int  m= (int)Math.cbrt(l);
          System.out.println(m);

          /*till concept cleared  */
         
    }
    
}
