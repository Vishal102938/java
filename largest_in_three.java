import java.util.Scanner;
public class largest_in_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = sc.nextInt();

        System.out.print("Enter Second number:");
        int b = sc.nextInt();

        System.out.print("Enter Third number:");
        int c = sc.nextInt();

        int greatest_number = (a>b) ? (a>c ? a:c) : (b>c ? b:c);
        System.out.println(greatest_number+" is the greatest number");
    }
}
