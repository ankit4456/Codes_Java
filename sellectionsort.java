public class sellectionsort {
    public static void printarr(int arr[])
    {
        for(int i = 0 ;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int arr[] = {7,5,9,2,4};
        for(int i=0 ; i<arr.length-1;i++)  //iterate at evey element 
        {
            int small = i;   //in small contilner un for evey value for the i
            for(int j = 1+i;j<arr.length;j++)    // it make a  started box free then compare 
            {
                if(arr[small]>arr[j])
                {
                    int temp = arr[small];
                    arr[small] = arr[j];
                    arr[j] = temp;

                }


            }
        }
        printarr(arr);


    }
    
}
