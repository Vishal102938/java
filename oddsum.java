import java.util.Scanner;
public class oddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        oddsum(a);
    
    }

    public static void oddsum(int a) {
        int i = 1;
        int sum=0;
        while(i<=a){
            sum=sum+i;
            i=i+2;
        }
        System.out.println(sum);
        
    }
}
