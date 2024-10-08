import java.util.Scanner;
class linear_search{
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

        linear_search(x,a);
        
    }
    public static void linear_search(int [] x , int a) {
        int f = 0;
        for(int i = 0;i<x.length;i++){
            if(a==x[i]){
                System.out.println("Your element is found at"+(i+1));
                f=1;
                break;
            }
        }
        if(f==0){
            System.out.println("Your item is not found in the array");
        }
        else{
            System.out.println("Your item is found in the array");
        }
    }
}
