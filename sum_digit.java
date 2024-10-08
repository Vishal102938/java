import java.util.Scanner;
public class sum_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        sum(num);
        
    }
    public static void sum(int num) {
        int s = 0;
        while(num>0){
            int r = num % 10;
            s = s+r;
            num=num/10;   
        }
        System.out.println("The sum of digit of is " +s);
    }
}
