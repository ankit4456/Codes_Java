public class String_character {
    public static void main(String[] args) {
        String hi = "ankit";
        char[] by  = hi.toCharArray();
        System.out.println(by[0]);
        for(int i=0;i<hi.length();i++)
        {
          if(by[i]>='a' && by[i]<='z')
          {
             System.out.println((char)(by[i]-32));

          }

        }

        /*or we use upper case  */
        System.out.println(hi.toUpperCase());   //same thing 






        String hii = "aman";
        int a = hii.length();
        System.out.println(a);
    }
    
}
