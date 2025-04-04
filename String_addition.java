public class String_addition {
    public static void main(String[] args) {
        String a = "123";
      for(int i=a.length()-1;i>=0;i--)
      {
        System.out.println(Character.getNumericValue(a.charAt(i)));
      } 
       }
    
}
