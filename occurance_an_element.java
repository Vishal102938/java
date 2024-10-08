import java.util.Scanner;
public class occurance_an_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();
        int [] x = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter the elements:");
            x[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to search:");
        int a = sc.nextInt();

        int occurance = occ(x,a);
        System.out.println("The element "+ a +" occur " + occurance +" times ");
    }
    public static int occ(int[] x, int a) {
        
        int i = 0;
        int c = 0;
        while(i<x.length){
            if(x[i]==a){
                c=c+1;
            }
            i++;
        }
        return c;
    }
    
}
