import java.util.HashMap;
public class Hashmapppimplimentation_java{
    public static void main(String[] args){
        HashMap<Integer , Integer> hi = new HashMap<>();
        hi.put  (1 , 2);
        hi.put(5 , 6);
        System.out.println(hi.values());
        System.out.println(hi.keySet());

        System.out.println(hi.entrySet());
/**Yes, you are absolutely right! getOrDefault(key, defaultValue) is mainly used when updating frequencies (or counting occurrences) in
 *  a HashMap while iterating through an array.*/
        System.out.println(hi.getOrDefault(1 ,0));
        System.out.println();
    }
}