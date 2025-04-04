import java.util.*;
class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array ");
        int n = sc.nextInt();
        int[] nums = new int[n];


        //for input
        for(int i=0 ; i<nums.length-1;i++)
        {
            nums[i] = sc.nextInt();
        }


        System.out.println("enter the element you want to sesarch-->");
        int m = sc.nextInt();


        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==m)
            {
                System.out.println(i);
            }

        }

        
    sc.close();
        
        
    }
}