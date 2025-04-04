public class Where_should_use_whileloop_binarysearch {
    public static void main(String[] args) {
        int k=9;
        int[] hi = {1,2,3,4,5,6,7,8,9,10};


         int first = 0;
         int last = (hi.length-1);
         int mid = 0;
         while(first<last)
         {
            mid = first +(last-first)/2;
            if(hi[mid]==k)
            {
                System.out.println("this is the positon:--" + mid);
                // break;
            }
           else if(hi[mid]<k)
            {
               first = mid+1;
            }
            else{
                last = mid-1;
            }

         }
        
    }
    
}
