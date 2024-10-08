class Animal {
    int legs;
    void eat()
    {
        System.out.println("eating");
    }
}
class first{
    void run()
    {
        System.out.println("running");
    }
    public static void main(String[] args) {
        Animal cat=new Animal();
        cat.legs=4;
        System.out.println(cat.legs);
        cat.eat();

        first fis=new first();
        fis.run();
        
    }
}
