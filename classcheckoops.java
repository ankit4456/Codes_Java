// Online Java Compiler
// Use this editor to write, compile and run your Java code online


class Car
{
    String colour ;
    int price ;
    public void printkaro()
    {
    System.out.println(this.colour);
    System.out.println(this.price);
    }
}
class clascheckoops {
    public static void main(String[] args){
        Car c1 = new Car();      //constrructor is the way to make the object of the class
        c1.price = 3;
        
        c1.printkaro();
        
    }
}