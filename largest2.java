import java.util.Scanner;
public class largest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first nmuber:");
        int a = sc.nextInt();

        System.out.print("Enter second nmuber:");
        int b = sc.nextInt();

        int max = largest_number(a,b);
        System.out.println(max+" is greatest number");
    }
    public static int largest_number(int a , int b) {
        int greatest_number = (a>b)?a:b;
        return greatest_number;
        
    }
   
}