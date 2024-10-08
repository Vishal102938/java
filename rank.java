import java.util.Scanner;
public class rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks:");
        int marks = sc.nextInt();

        String rank = (marks>80) ? "High" :(marks>50 ?"Moderate":"looser");
        System.out.println("you are "+rank);
    }
}
