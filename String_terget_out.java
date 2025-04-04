public class String_terget_out {
    public static void main(String[] args) {
        // String hi  ="ankit";
        // String out = hi.substring(2,3);
        // System.out.println(out);    /*both are doing same thing */

        // char[] by = hi.toCharArray();
        // System.out.println(by[2]); /*both are doing same thing */

        // String a = "   ankit raj     ";
        // String b = a.trim();
        // System.out.println(b);  // remove the outer space
       

        String d ="  hi my name    is ankit raj  ";
        String e =d.trim();

        String[] h = e.split("\\s+");
        // for(String hii:h)  // due to it is String array so i inhanced for loop for the String array 
        // {
        //     System.out.print(hii);
        //   if(hii.length()>0)
        //   {
        //     System.out.print(" ");

        //   }
        // }
        /*insted og this we can also use this */
        for(int i=0;i<h.length;i++)
        {
            System.out.print(h[i]);
            if(i<h.length)
            { System.out.print(" ");

            }
        }
 /*------------------------------------------------------------------------------------------------------------------------------- */
    }
    
}
