import java.util.Scanner;
public class smallest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the element:");
        int size = sc.nextInt();

        int [] x = new int[size];
        for(int i=0;i<x.length;i++){
            System.out.print("Enter elements in the array:");
            x[i] = sc.nextInt();
        }
        smallest(x);
    }
    public static void smallest(int [] x) {
        int min = x[0];
        for(int i=0;i<x.length;i++){
            if(x[i]<min){
                min = x[i];
            }
        }
        System.out.print("Smallest element is:"+min);
    }
}
