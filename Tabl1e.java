import java.util.Scanner;
public class Tabl1e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        hello1(a);
    }
    public static void hello1(int a){
        int i=1;
        while(i<=10){
            System.out.println(a*i);
            i=i+1;
        }
    }
    
}
