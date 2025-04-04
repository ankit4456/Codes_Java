public class reminder_basic {
    public static void main(String[] args) {
        int n=  20;
        while(n>0){
            int count = n%10; 
            System.out.println(count);
            n =n/10;
        }
    }
    
}
