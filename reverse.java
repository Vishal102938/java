import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();

        reverse_num(a);
    }
    public static void reverse_num(int a) {
        int s=0;
        while(a>0){
            int r=a%10;
            s=s*10+r;
            a=a/10;
        }
        System.out.print("The reverse is: "+s);
        
    }
}
