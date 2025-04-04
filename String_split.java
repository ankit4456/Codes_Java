public class String_split {
    public static void main(String[] args) {
        String a = "  hello world    ";
        String[] word = a.split("\\s+");

        for(int i=0;i<word.length;i++){
            System.out.println(word[i]);
        }
}
}
 