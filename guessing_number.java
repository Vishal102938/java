import java.util.Scanner;
public class guessing_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5 , guess;
        System.out.println("Enter the number between 1 to 10 to guess:");

        do{
            System.out.println("Enter the number:");
            guess = sc.nextInt();
        }while(num!=guess);
        System.out.println("You are successful");
    }    
}
