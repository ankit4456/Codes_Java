import java.util.ArrayList;

public class Arraylist_remove_if_string{
    public static void main(String[] args) {
        // Create an ArrayList of names
        ArrayList<String> names = new ArrayList<>();
        names.add("Ankit");
        names.add("Aman");
        names.add("Mahendra");
        names.add("Raj");

        // Use removeIf to remove all names starting with "A"
        names.removeIf(name -> name.startsWith("A"));

        // Print the remaining names
        System.out.println("Names after removing those starting with 'A': " + names);
    }
}
