public class oops {
    public static void main(String [] args)
    {
        pen p1 = new pen();   //constructor
          
    p1.setcolour("red");
    p1.setcolour("yellow");
    System.out.println(p1.colour);
    p1.newtip(5);
    System.out.println(p1.tip);
    p1.colour="pink";


    bankaccount b1 = new bankaccount(); //constructor

    b1.namechange("ankit");
    System.out.println(b1.username);
    }
    
}
class bankaccount{
    public String username;    //membervariable
    public void namechange(String naaam){
        username = naaam;
    }
    
    private String password = "ankit" ;   //membervariable
    public void setpassword(String pwd)
    {
        
        password ="ankit";
        System.out.println(password);

    }
}
class pen{
    String colour;
    int tip;
    void setcolour(String newcolour){
        colour = newcolour;
    }
    void newtip(int size){
    tip =size;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calcpercentage(int phy, int chem ,int math )
    {
        percentage = (phy+chem+math)/3;

    }
}