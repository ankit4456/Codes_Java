public class length_size_confusion {
    public static void main(String[] args) {
        String name = "ankit";
        System.out.println(name.length());   // this use for string length

        String[] ni = new String[4];
        ni[0] = "ankit";
        ni[1] = "ankit";
        ni[2] = "ankit";
        ni[3] = "ankit";
        System.out.println(ni.length);   //used for count of the array capacity
    }
    
}
