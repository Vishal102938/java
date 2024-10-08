import java.util.Scanner;
public class odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int i = 1;
        int s = 0;
        while(i<=n){
            if(n%2==1){
                s=s+i;  
            }
            i=i+2;
        } 
        System.out.println("The sum of odd numbers till " + n +" is " + s);
    }
}
