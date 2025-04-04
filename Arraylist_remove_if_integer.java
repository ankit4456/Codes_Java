 import java.util.ArrayList;

 public class Arraylist_remove_if_integer {
     public static void main(String[] args) {
         // Create an ArrayList of integers
         ArrayList<Integer> numbers = new ArrayList<>();
         numbers.add(10);
         numbers.add(15);
         numbers.add(20);
         numbers.add(25);
         numbers.add(30);
 
         // Use removeIf to remove all even numbers
         numbers.removeIf(num -> num % 2 == 0);
 
         // Print the remaining numbers
         System.out.println("Numbers after removing even numbers: " + numbers);
     }
 }
 
