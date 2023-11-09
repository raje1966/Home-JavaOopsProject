package home;

class Vghs {
    
    void life() 
    {
        System.out.println("Living in Vghs is very good");
    }
}
class Hall extends Vghs 
{
    void life() 
    {
        System.out.println("Living in Hall is hectic");
    }
}
    
class Bedroom extends Vghs 
{
    void life() 
    {
        System.out.println("Sleeping is comfortable in Bedroom");
    }
}
    
class Kitchen extends Vghs 
{
    void life() 
    {
        System.out.println("Cooking is the first action done in Kitchen");
    }
}


public class Home 
{
    public static void main(String[] args) {
        
        Hall h = new Hall();
        Bedroom b = new Bedroom();
        Kitchen k = new Kitchen();
        
        Vghs ref;
        
        ref = h;
        ref.life();
        
        ref = b;
        ref.life();
        
        ref = k;
        ref.life();
        
    }

}