import java.util.*;
public class arraylist_declaration_type {
public static void main(String[] args) {
    ArrayList<Integer> hi =new ArrayList<Integer>();  //class implements  class
    hi.add(1);
    hi.add(2);
    System.out.println(hi);
    int count = 0;
    for(Integer by:hi)  // by work as a pointer

    {
        count=count+1;

    }
    System.out.println(count);
  /*impleemeting tthis thinng byb another way---> ArrayList<Integer> hi =new ArrayList<Integer>(); */
  List<Integer> by =new ArrayList<Integer>();  // INTER FACE IMPLEMENTS BY ARRAYLIST CLASS
  by.add(1);
  by.add(2);
  System.out.println(by);
  int add = 0;
  for(Integer ll:by)
  {
   add  = add+1;
  }
System.out.println(add);


}
    
}
