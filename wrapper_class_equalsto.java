public class wrapper_class_equalsto {
    public static void main(String[] args)
    {


        /* this _.equals(_) works with class and wrapper class onluy not working with premitive data type  */


       String hi = "ankit";
       String by ="ankit";
    //    System.out.println(hi.equals(by));
    if(hi.equals(by))
    {
        System.out.println("this is executed");
    }
    else{
        System.out.println("this is  not executed ");
    }





    Integer a = 9;
    Integer b = 2;
    // System.out.println(a.equals(b));
    if(a.equals(b))
    {
        System.out.println("this is true");
    }
    else{
        System.out.println("this is false");
    }


    
    }
    
}
