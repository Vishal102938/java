import java.util.Scanner;
public class array_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] x = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter the number for search:");
        int a = sc.nextInt();
        boolean isFound = search(x,a);
        
        if(isFound){
            System.out.println("Your number is in the array");
        }
        else{
            System.out.println("Your number is not in the array");
        }
    }

    public static boolean search(int [] x, int a) {
        int i=0;
        while(i<x.length){
            if(x[i]==a){
                return true;
            }
            i++;
        }
        return false;
        
    }
}
