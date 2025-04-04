// concationation := by the help of this we can add two strings
public class strings_1 {
    public static void main(String[] args )
    {
        String  fname = "ankit" ;
        String lname  = "raj";

        String fullname = fname + lname;
        
        // here we can also know the length of the string by the help oh the .lenght function 
        System.out.println(fname.length());
        System.out.println(lname.length());
        System.out.println(fullname.length());
        for(int i = 0 ; i<fullname.length();i++)
        {
            System.out.println(fullname.charAt(i));  // chatAt can read the charactor at the ith postion 
        }


    }
}
