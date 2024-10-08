import java.util.Scanner;
public class copy_1arrtoanother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();

        int [] x = new int[size];
        int [] y = new int[x.length];

        for(int i=0;i<x.length;i++){
            System.out.print("Enter the element in the array:");
            x[i]=sc.nextInt();
        }
        copy(x,y);
    }
    public static void copy(int [] x , int [] y) {
        int i = 0;
        for(i=0;i<x.length;i++){
            y[i] = x[i];
        
        }

        System.out.print("The element of x[] is:");
        for(i=0;i<x.length;i++){
            System.out.print(x[i] + " ");
        }

        System.out.print("The element of y[] is:");
        for(i=0;i<y.length;i++){
            System.out.print(y[i]+" ");
        }
    }
}
