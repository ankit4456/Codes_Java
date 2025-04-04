public class IntegertoBinaryinjava {
    public static void main(String[] args) {
        int n=  2;
       String hi =  Integer.toBinaryString(n);
        System.out.println(hi);

        int by  = Integer.parseInt(hi);
        System.out.println(by);
        int lol = by*10;
        System.out.println(lol);

        //want to perform the AND operation on it 
        int a = 1;
        int b = 3;
        int c = a&b;
        System.out.println(c);

    }
    
}
