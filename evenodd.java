import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nmuber:");
        int a = sc.nextInt();
        String result = a%2==0 ? "even" : "odd";
        System.out.println(result+" number");
    }
}
