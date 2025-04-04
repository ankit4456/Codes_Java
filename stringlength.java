public class stringlength {
    public static void main(String[] args) {
        String a = ("Welcome to CVR");
        String[]  word = a.split("\\s+");  //this can convert the string to sub string on the basis of the there whitespace or blanck charactor 
        int c = word.length;
        System.out.println(c);

    }
    
}