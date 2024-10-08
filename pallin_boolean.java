import java.util.Scanner;
public class pallin_boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size = sc.nextInt();

        int [] x = new int[size];
        for(int i=0;i < x.length;i++){
            System.out.print("Enter the elements:");
            x[i] = sc.nextInt();
        }
        boolean ispallindrome = pallindrome(x);
        if(ispallindrome){
            System.out.print("Your array is pallindrome");
        }
        else{
            System.out.print("Your array is not pallindrome");
        }
    }
    public static boolean pallindrome(int [] x) {
        int i = 0;
        while(i < x.length){
            if(x[i] != x[x.length -1 -i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
