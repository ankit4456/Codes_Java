import java.util.*;
public class reverse_string {
public static void main(String[] args)
{
    Scanner sc   = new Scanner(System.in);

    int size = sc.nextInt();

    String[] letter = new  String[size];

    for(int i=0;i<size;i++)
    {
        letter[i]  = sc.next();
    }


    for (int i =size-1;i>=0;i--)
    {
        System.out.print(letter[i] + " ");
    }
    

}

    
}
