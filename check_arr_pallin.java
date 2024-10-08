import java.util.Scanner;
public class check_arr_pallin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();

        int [] x = new int[size];
        for(int i=0 ; i<x.length ; i++){
            System.out.print("Enter the elements:");
            x[i] = sc.nextInt();
        }

        pallindrome_arr(x);
    }    
    public static void pallindrome_arr(int [] x) {
        int i=0;
        while(i < x.length/2 ){
            if(x[i] != x[x.length - 1- i]){
                System.out.println("not pallindrome");
                
                i++;
                break;
            }
            else{
                System.out.println("yes pallindrome");
                break;
            }
            
        }
        
    }
}
