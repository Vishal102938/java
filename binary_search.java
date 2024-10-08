import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();

        int [] x = new int[size];
        for(int i=0;i<x.length;i++){
            System.out.print("Enter the element:");
            x[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched:");
        int a = sc.nextInt();

        binary_search(x,a);
        
    }
    public static void binary_search(int [] x , int a) {
        int f = 0;
        int min = x[0];
        int max = x.length-1;

        while(min<max){
            int mid = (min+max)/2;
            if(a==x[mid]){
                System.out.println("Your element is found at"+(mid+1));
                f=1;
                break;
            }
            else if(x[mid] > a){
                mid = mid+1;
            }
            else{
                mid = mid-1;
            }
        }
        if(f==0){
            System.out.println("Your item is not found in the array");
        }
    }
}
