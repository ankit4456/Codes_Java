import java.util.*;
public class pelendrome {
    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER ---->");
        int num = sc.nextInt();
        int reverse_num =0;
        int  reminder;
        int temp =num;     // this is the input taken only for the 
        while(num!=0)    // this is the logic for < reverse >   or   < swap >
        {
            reminder = num%10;
            reverse_num = reverse_num*10+reminder;
            num = num/10;
        


        }
        System.out.println(reverse_num);
        if (temp==reverse_num)       //this is for cheaking the pelendrome 
        {
            System.out.println("this is an peleendrome");
        }
        else
        {
            System.out.println("this is not a pelendrome number");

        }
        
        sc.close();


    }
}