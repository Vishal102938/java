import java.util.Scanner;
public class check_sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();

        int [] x = new int[size];

        for(int i=0;i<x.length;i++){
            System.out.print("Enter the elements:");
            x[i] = sc.nextInt();
        }

        boolean inc = increasing_sorted(x);
        boolean dec = decreasing_sorted(x);

        if(inc || dec){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
    public static boolean decreasing_sorted(int []x) {
        int i = 1;
        while(i < x.length){
            if(x[i] > x[i-1]){
                return false;
            }i++;
        }
        return true;

    }

    public static boolean increasing_sorted(int []x) {
        int i = 1;
        while(i < x.length){
            if(x[i] < x[i-1]){
                return false;
            }
            i++;
        }
        return true;

    }
}
