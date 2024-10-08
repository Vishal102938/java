import java.util.Scanner;
public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size= sc.nextInt();
        int x[] = new int[size];
    
        for(int i=0;i<x.length;i++){
            System.out.print("Enter the elements:");
            x[i] = sc.nextInt();
        }
        reverse_array(x);
        display(x);
        
    }
    
    public static void reverse_array(int [] x) {
       
        int i = 0;
        while(i<x.length/2){
            int swap = x[i]; 
            x[i] = x[(x.length-1)-i];
            x[(x.length-1)-i] = swap;
            i++;
        }
    }
    public static void display(int [] x) {
        for(int i=0;i<x.length;i++){
            System.out.println("The reverse array is:");
            System.out.println(x[i]);
        }    
    }
}
