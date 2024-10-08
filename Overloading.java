public class Overloading {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public String add(String a,String b){
        return a + b;
    }
    
    public static void main(String[] args) {
        Overloading overload = new Overloading();
        System.out.println(overload.add(3,4));
        System.out.println(overload.add(3,4,5));
        System.out.println(overload.add("Ram","Shyam"));

    }
}
