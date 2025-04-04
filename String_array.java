public class String_array {
    public static void main(String[] args) {
        String[] hi  = new String[4];
        hi[0] = "ankit";
        hi[1] = "aman";
        hi[2] = "akii";
        hi[3] = "amit";
        // hi[4] = "bharat";
        // hi[5] = "amlait";
        // hi[6] = "nahi lega";

       /* we can use iterables bcz of the Strign is a  class */
        for(String sr:hi)
        {
            System.out.print(sr + " ");
        }

        
        int[] by  = new int[3];
        by[0] = 1;
        by[1] = 2;
        by[2] = 3;
        System.out.println(by);//this is the not the way to print the array it eill give you the garbaze value 

        // use iterator
        for(Integer ass:by)
        {
            System.out.print(ass +" ");
        }

    }
    
}
