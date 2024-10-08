import java.util.Scanner;
public class lcm_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        LCM(a,b);
    }
    public static void LCM(int a , int b) {
        int l = 0;
        if(a<b){
            l = a;
        }
        else{
            l = b;
        }

        for(int i=l;i>0;i--){
            if (a%i==0 & b%i==0){
                break;
            }
        System.out.println((a*b)/i);
        }
        
        
    }
}
