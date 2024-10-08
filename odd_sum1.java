package function;

import java.util.Scanner;

class odd_sum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        oddsum(n);
    }

    public static void oddsum(int n){
        int i = 1;
        int s = 0;
        while(i<=n){
            if(n%2==1){
                s=s+i;
            }
            i=i+2;
        }
        System.out.println(s);
    }
    
}
