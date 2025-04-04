
public class oopsgetterssetters {
    public static void main(String [] args)
    {
       pen p1  = new pen();
       p1.setcolour("blue");
       System.out.println(p1.getcolor());
       p1.tip=5;
       System.out.println(p1.tip);
    }
}

class pen{
    String color;
    int tip;
    String getcolor()   ///getter
    {
        return this.color;
    }

    int gettip(){
        return this.tip;

    }
    void setcolour(String newcolor)
    {
          this.color = newcolor;  
    }
    
}
 
