import java.util.Scanner;
public class table1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number:");
        int a = sc.nextInt();
        multiply(a);
    }

    public static void multiply(int a){
        int i=1;
        while(i<=10){
            System.out.println(a*i);
            i++;

        }
    
    }
    
}
