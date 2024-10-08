import java.util.Scanner;

public class marks {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hindi marks: ");
        int a = sc.nextInt();

        System.out.println("Enter English marks: ");
        int b = sc.nextInt();

        System.out.println("Enter Maths marks: ");
        int c = sc.nextInt();

        System.out.println("Enter Physics marks: ");
        int d = sc.nextInt();

        System.out.println("Enter Chemistry marks: ");
        int e = sc.nextInt();

        System.out.println("Enter Data structure marks: ");
        int f = sc.nextInt();

        int g = (a + b + c + d + e + f) / 6;

        System.out.println("Average marks of the subjects: ");
        System.out.println(g);

        System.out.print("Marks in Percentage: ");
        int h = (((a + b + c + d + e + f) / 6) * 100);
        System.out.println(h);

    }

}
