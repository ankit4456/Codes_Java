public class reverse_number {
    public static void main(String[] args) {
        int a= 123;
        int contain=0;  //only one dumy we need to store 
        while(a!=0)
        { int remin = a%10; 
          contain = contain*10+remin;  // store withsome logic
          a=a/10;
        }
        System.out.println(contain);

    }
    
}
