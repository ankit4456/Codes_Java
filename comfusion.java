import java.util.*;
public class comfusion {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        System.out.print("enter your name -->");
        String name = sc.nextLine();

StringBuilder sb = new StringBuilder (name);

for(int i=0; i<sb.length()/2; i++) 
{
int front = i;
int back = sb. length() - 1 - i; // 5-1-0 = > 4

char frontChar = sb. charAt (front);
char backChar = sb. charAt (back);
sb. setCharAt (front, backChar); sb.setCharAt(back, frontChar);
System. out. println(sb);
}
    
}
}
