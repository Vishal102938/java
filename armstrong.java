import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();

        arm(a);
    }
    public static void arm(int a) {
        int b = a;
        int s = 0;
        while(a>0){
            int r=a%10;
            s=s+r*r*r;
            a=a/10;
        }
        if(b==s){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        
    }
}
