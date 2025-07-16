public class function {
    static void sum() // void without parameter
    {
        System.out.println("Fun 0");
        sum1(0);
    }

    static void sum1(int n)  // void with parameter
    {
        System.out.println("Fun 1");
        sum2();
    }

    static int sum2() // non-void without parameter
    {
        System.out.println("Fun 2");
        sum3(0);
        return 0;
     
    }

    static int sum3(int n)  // non-void with parameter
    {
        System.out.println("Fun 3");
        return 0;
    }
    public static void main(String[] args) {
        sum();
        
    }
}
