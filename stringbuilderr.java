public class stringbuilderr
{
    public static void  main (String[] args)
    {
        StringBuilder sb = new StringBuilder("tony");
        // System.out.println(sb);

        /* this is for the pourpse of reading  */
        System.out.println(sb.charAt(0));


        /*here we can use this-->sb.setCharAt(0 , 'A'); for the charactor replacement in the word*/
        sb.setCharAt(0 , 'A');
        System.out.println(sb);

        /*and here we can use this for the string insertion */
        sb.insert(1, "b");
        System.out.println(sb);

        /*and here we learn to delete somethinng from the string */
        sb.delete(1,3);    //last value suppse here 3 is non inclusive
        System.out.println(sb);

        /*here also we can append the string  */
        sb.append('a'); //here the the string append by 'a' at the last in the same string 
        sb.append('n');
        sb.append('k');
        sb.append('i');
        sb.append('t');
        System.out.println(sb);

        /*here we can also find the length of the string using .length() */
    System.out.println(sb.length());

  
    }
}