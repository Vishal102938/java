import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int b=n*n;

        if(isAuto(n,b)){
            System.out.println("Number is Automorphic");
        }
        else{
            System.out.println("Nunmber is not Automorphic");
        }
    }
    public static boolean isAuto(int n,int b){
        int c=n;
        while(c>0){
            if(c%10 != b%10){
                return false;
            }
            else{
                c=c/10;
                b=b/10;
            }
        }
        return true;
    }
}
