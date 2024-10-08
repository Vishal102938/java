
import java.util.Scanner;
public class A {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int i, a, ans=0;
        System.out.print("Enter the index:");
        try{
            i= sc.nextInt();
            System.out.println("Enter a value:");
            a=sc.nextInt();
            ans = arr[i]/a;
        }catch(ArrayIndexOutOfBoundsException ee)
        {
            System.out.println("Some error has been occured");
        }catch(ArithmeticException ee){
            System.out.println("The can't be divided by zero");
        }
        System.out.println("Ans "+ans);
    }
}
