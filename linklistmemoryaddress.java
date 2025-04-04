/* i sis a simle code of linklist  add and find the index of the specific given location  the memoey walla question nicche sole kia hua hai our comment line kia hua hai  */
import java.util.*;
public class linklistmemoryaddress{
    public static void main(String[] args)

    {
        LinkedList<Integer>  list  = new  LinkedList<Integer>();
        list.add(1);
        list.add(5);

        list.add(7);

        list.add(3);

        list.add(8);

        list.add(2);

        list.add(3);

        System.out.println(list);

         for(int i=0 ; i<=list.size()-1 ; i++)
         {
            if(list.get(i)==7)
            {
                System.out.println(i+ " is the index");
            }

         }




    }
}




















































// import java.util.*;
// public class linklistmemoryaddress {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         LinkedList<Integer> list = new LinkedList<Integer>();

//         System.out.println("Enter your elements---->");
//         int n = sc.nextInt();


//          /*main logic ----> to fin dthe address --->System.identityHashCode(element)*/

//         int temp = 0 ;
//         for(int i = 0;i<=n-1;i++)

//         {
//            int element = sc.nextInt();
//            list.add(element);
//            System.out.println("this is the memory address ->" + i + "st" + System.identityHashCode(element));
//            temp = temp +element;
//            if(element ==7)
//            {
//          System.out.println("the index of the element is " + i);
//          break;
//            }
          
//         }
//         System.out.println("is you  total sum -->" + temp);


        
//         sc.close();
//     }
// }
