/*Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava” 
email = “helloWorld123@gmail.com”; username = “helloWorld123” */

import java.util.*;
public class stringemail_cutter {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        String email  = sc.nextLine();
         
        int  read_at_the_rate =email.indexOf('@');         //sneekpeek

        String cut_that_part = email.substring(0,read_at_the_rate);   //method sneekpeek //or say to pick out the substring 
        System.out.println(cut_that_part);

        
    }
    
}
