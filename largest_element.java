import java.util.Scanner;
public class largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int [] x = new int[size];

        for(int i=0;i<x.length;i++){
            System.out.print("Enter the element in the array:");
            x[i] = sc.nextInt();
        }

        large(x);
    }

    public static void large(int [] x) {
        int max = x[0];
        for(int i = 0;i<x.length;i++){
            if(x[i]>max){
                max=x[i];
            }
        }
        System.out.println("Largest number is:"+max);
        
    }
}
