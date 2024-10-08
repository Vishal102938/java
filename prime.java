import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();

        prime_no(a);
    }
    public static void prime_no(int a) {
        int s=0;
        for(int i =1;i<=a;i++){
            if(a%i==0){
                s=s+1;
            }
        }
        if(s==2){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }
        
    }
}
