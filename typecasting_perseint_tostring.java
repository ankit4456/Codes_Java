public class typecasting_perseint_tostring {
    public static void main(String[] args) {
       /*to string--> method of string class */
       int a = 123123;
       String b =Integer.toString(a);
       System.out.println(b.length());

       /*to persee int -method of integer class */
       String as = "100";
       int hi = Integer.parseInt(as);
       String by =" is_a_good_persion";
       System.out.printf(hi+by);
    }
    
}
