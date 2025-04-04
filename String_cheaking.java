// import java.util.Scanner;

public class String_cheaking {
    public static void main(String[] args) {
        
        StringBuilder hi = new StringBuilder();
        //  hi.append("null");
        String A="aka";
        int l = A.length();
        for(int i=l-1;i>=0;i--)
        {
            hi.append(A.charAt(i));
            // System.out.println(A.charAt(i));
        }
        if(A.equals(hi.toString()))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        

        
          
    }
}