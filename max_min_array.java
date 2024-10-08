import java.util.Scanner;
public class max_min_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();

        int [] x= new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the element:");
            x[i] = sc.nextInt();

        }

        int maximum = max_num(x,size);
        int minimum = min_num(x,size);
        
    }

    public static int max_num(int [] x,int size){
        int max = x.length-1;

        for(int i = 0; i<x.length-1; i++){
            if(x[i]>max){
                max = x[i];
                System.out.println("Maximum number is "+max);
            }
        }
        return max; 
    }

    public static int min_num(int [] x,int size) {
        int min = x[0];

        for(int i=x.length-1;i>0;i++){
            if(x[i]<min){
                min=x[i];
                System.out.println("minimum element is: "+min);
            }
            else{
                min=x[0];
                System.out.println( "Minimum element is"+min);
            }
        }
        return min;
    }
}
