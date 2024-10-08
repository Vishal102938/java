interface A{
    void sleep();
    default void run()
    {
        System.out.println("hello");
    }    
}
interface B
{
    default void eat()
    {
        System.out.println("hii");
    }
}
public class C implements A , B
{   
    public static void main(String[] args) {
        C h = new C();
        h.eat();
        h.run(); 
    }
}
