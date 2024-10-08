interface vehicle{
    static void clean()
    {
        System.out.println("Cleaning");
    }
}
class car implements vehicle
{
    @Override
    public void clean()
    {
        System.out.println("cleaning clean");
    }
    public static void main(String[] args) {
        car c = new car();
        c.clean();
    }
}
