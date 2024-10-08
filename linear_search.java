import java.util.Scanner;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();

        int [] x = new int[size];
        for(int i=0; i<x.length; i++){
            System.out.print("Enter the elements:");
            x[i] = sc.nextInt();
            
        }
    }
}
