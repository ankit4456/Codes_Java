import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist_madeby_userinput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter your range-->");
        int m = sc.nextInt();



        LinkedList<Integer> list = new LinkedList<>();
        for(int  i = 0;i<=m-1;i++)
        {
            int n = sc.nextInt();
            list.add(n);

            
        }  
        System.out.println(list);
        
        for(int i =0;i<=list.size()-1;i++)
        {
            if(list.get(i)>=25)
            {
               list.remove(i);
            }
           

        }
        System.out.println(list);
        
       
          sc.close();
    }
    
}
