import java.util.Scanner;
public class array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        int [] x = new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter element--");
            x[i] = sc.nextInt();
            
        }

        long sum = sum(x);

        float average = avg(x);
    
        System.out.println("The sum of all number: "+sum);
        System.out.println("The average of all numbers: "+average);
    }

    public static long sum(int[] x){
        int i = 0;
        long sum = 0;
        while(i<x.length){
            sum = sum+x[i];
            i++;
        }
        return sum;
    }

    public static float avg(int [] x) {
        int i = 0;
        long sum = 0;
        while(i<x.length){
            sum = sum+x[i];
            i++;
        }
        return sum/(x.length);
    }
}

