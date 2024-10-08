import java.util.Scanner;
import java.util.Arrays;
public class check_arrequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array:");
        int size1 = sc.nextInt();
        int [] x = new int[size1];

        for(int i=0;i<size1;i++){
            System.out.println("Enter element--");
            x[i] = sc.nextInt();
        }

        System.out.println("Enter the size of second array");
        int size2 = sc.nextInt();
        int [] y = new int[size2];

        for(int i=0;i<size2;i++){
            System.out.println("Enter element--");
            y[i] = sc.nextInt();
        }

        check_equal(x,y);
    }
    public static void check_equal(int [] x, int [] y) {
        boolean result = Arrays.equals(x,y);

        if(result == true){
            System.out.print("The arrays are equals");
        }
        else{
            System.out.println("The arrays are not equals");
        }
    }
}