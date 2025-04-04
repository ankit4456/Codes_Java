// this to convert the integer to string or say typecasting//
public class Tostring {
    public static void main (String [] args)
    {

        /*both are the methods of the integer class */
        int num  = 123;
        String str  = Integer.toString(num);
        int a = str.length();
        System.out.println(a);
        System.out.println(str);



        String ab = "123";  // s
        int ad = Integer.parseInt(ab);
        System.out.println(ad);
        int al = 4 +ad;
        System.out.println(al);


        /*counting using while */
        int count  =0;
        while(ad>0)
        {
            ad=ad/10;
            count  = count+1;
        }
        System.out.println(count);
        /*then we have to cheak that it is pelendrome or not */
     int bb = 0;
        while(ad!=0)
        {
            int cc = ad%10;
             bb = bb*10+cc;
             cc=cc/10;
        }
        System.out.println(bb);
        

    }    
}
