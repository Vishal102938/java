import java.util.Scanner;

public class identify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();

        if(a>0){
            System.out.println("It is a positive number");
        }
        else if(a<0){
            System.out.println("It is negative number");
        }
        else{
            System.out.println("It is zero");
        }
}
}
