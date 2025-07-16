import java.util.Scanner;

public class disarium {
    public static int digits(int n) {
        int c= 0;
        while (n != 0) {
            c++;
            n =n/ 10;
        }
        return c; 
    }
    public static boolean isDisarium(int n) {
        int sum = 0;
        int c = digits(n); 
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10; 
            sum += Math.pow(digit, c); 
            temp /= 10; 
            c--; 
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isDisarium(n)) 
        {
            System.out.println(n + " is a Disarium nber.");
        } 
        else 
        {
            System.out.println(n + " is not a Disarium nber.");
        }
    }
}