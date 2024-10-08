import java.util.Scanner;
public class even_without_mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
    
        while(n>=0){
            if(n==1){
                System.out.println("odd");
            }
            else if(n==0){  
                System.out.println("even");
            }
            n=n-2;
        }
    }
}
