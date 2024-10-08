import java.util.Scanner;
public class largest_in_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();

        int greater_number = a>b?a:b;
        System.out.println(greater_number +" is the greatest number");

    }
}
