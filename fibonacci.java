import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num for fibonacci series:");
        int num = sc.nextInt();
        fibo(num);        
    }
    public static void fibo(int num) {
        int a=0;
        int b=1;

        if(num==1){
            System.out.println(a);
        }
        else{
            System.out.println(a);
            System.out.println(b);
        }
        for(int i=1;i<num;i++){
            int z = a+b;
            System.out.println(z+" ");
            a=b;
            b=z;
        }
        
        
    }
}
