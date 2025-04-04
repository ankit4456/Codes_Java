public class stringtoloweranduppercase {
     /*doing manually */
     public static String covert(String a) {
        char[] ch = a.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
            {
                ch[i]=(ch[i]-32);
            }
        }
     }
    public static void main(String[] args) {
        /*toUpperCase*/

        String a  =("welcome");
        String b = a.toUpperCase();  //with library method

        System.out.println(b);
        
        /*toLowerCase*/


        String c  =("WELCOME");
        String d = a.toLowerCase(); //with library method

        System.out.println(d);

       

    }
    
}
