import java.util.*;

public class linkedlistprintwithticj {
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);


    LinkedList<Integer> list  = new  LinkedList<Integer>();

    System.out.println("Enter number of elements:");
    int n  = sc.nextInt();
    
    for(int i = 0; i<=n-1 ;i++)
    {
        list.add(sc.nextInt());
        System.out.println("->");
    }
    
    System.out.println(" Old List\\n");
    System.out.println(list);
     printLinkedList(list);
     Collections.reverse(list);

     // Printing reversed list in the given format
     System.out.print("New List\n");
     printLinkedList(list);

     sc.close();

}
public static void printLinkedList(LinkedList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i));
        if (i != list.size() - 1) {
            System.out.print(" -> ");
        }
    }
    System.out.println(" →> null");

}
    
}
