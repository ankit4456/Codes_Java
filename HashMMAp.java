import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class HashMMAp {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30); 

        //* both are doint same thing  */
        System.out.println(map);
        System.out.println(map.entrySet());

        //**findiing the maximum of the keys */
        int maximum = Collections.max(map.keySet());  //isko set isilie likha gaya kyoki set hai unique values
        System.out.println(maximum);


        //**findiing the maximum of the  value */
        int maximumm = Collections.max(map.values());   //isko values isilie likha gaya kyoki values hai BAHUT SARE (OUR HO SAKTA HAI SAMECOUNT ME HO YA HO SAKTA HAI NAAA HOOO)
        System.out.println(maximumm);

        //**cheaking that is keys or values is there or not  */
        System.out.println(map.containsValue(3));
        System.out.println(map.containsKey(3));

        //**itteratinf throung the map and the .getValue && .getKey method working */
        for(Map.Entry<Integer , Integer>  k:map.entrySet())   //**to use this loop we must need to import the package----> import java.util.Map; */
        {
            if(k.getKey()==3)
            {
                System.out.println(k.getValue());
            }
        }

       

    }
    
}
