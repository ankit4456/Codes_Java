public class secondlargestarray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,4,2,};
        int b = -1;   //just an assumption 
        int d = -1;
        for(int  i =0 ; i<6;i++)
        {
            if(arr[i]>b)
            {
                b = arr[i];
            }
        }
        for(int  i =0 ; i<6;i++)
        {
            if(arr[i]>d && arr[i]!=b)
            {
                d = arr[i];
            }
        }

        // return b ;
        System.out.printf("is teh second highest element-> %d ",d);
    }
   
    
}
