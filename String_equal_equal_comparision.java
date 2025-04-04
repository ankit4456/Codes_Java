public class String_equal_equal_comparision {
    public static void main(String[] args) {
        /***********************************************************************************************/
        //hoe to vovert the string to array 
        String hi = "ankit";
        char[] by  = hi.toCharArray();  //here the string is converted to the char array
        System.out.println(by);   //work like a normal string and to get this result we do also using loop 
        for(int i=0;i<hi.length();i++)
        {
            System.out.print(by[i]); //both are doing same thing
        }
        /******************************************************************************************/
        System.out.println();


        //how to ocnvert char array to string 
         char[] charArray = {'H', 'e', 'l', 'l', 'o'};
         String str = new String(charArray);
         System.out.println(str);  // Output: Hello


         //where to use .tostring() method
         String str1 = "Hello";
         String str2 = str1.toString();
         System.out.println(str2);  // Output: Hello


         //.equals() for content comparison (Correct ✅)
         String str3 = "Hello";
         String str4 = "Hello";
         System.out.println(str3.equals(str4));  // Output: true

         // .equals() for reference comparison (Incorrect ❌)
         String str5 = "Hello";
         String str6 = str5;
         System.out.println(str5.equals(str6));  // Output: true

         //.equals() for content comparison (Correct ✅)
         String str7 = "Hello";
         String str8 = new String("Hello");
         System.out.println(str7.equals(str8));  // Output: true

         //.equals() for content comparison (Correct ✅)
         String str9 = "Hello";
         String str10 = "Hello";
         System.out.println(str9.equals(str10));  // Output: true

         //.equals() for content comparison (Correct ✅)
         String str11 = "Hello";
         String str12 = new String("Hello");
         System.out.println(str11.equals(str12));  // Output: true

         //.equals() vs. == with String literals (Correct ✅)
         String str13 = "Hello";
         String str14 = "Hello";
         System.out.println(str13 == str14);  // Output: true  //bcz of the same memory location of the string literal

         
         /*Final Rule of Thumb:
         Use == for primitive types.
         Use .equals() for comparing object content.
         Do NOT use == to compare objects unless you are checking if they are the same instance in memory. */








        String hiii = "ankit";
        String byyy = "ankit";
        System.out.println(hiii.equals(byyy)); // both are doing same thing
        System.out.println(hiii == byyy); // both are doing same thing

    }
    
}
