import java.util.Scanner;
public class search_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row:");
        int rows = sc.nextInt();
        System.out.print("Enter the columns:");
        int cols = sc.nextInt();

        int [][] x = new int[rows][cols];
        for(int i = 0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter the elements:");
                x[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to search:");
        int a = sc.nextInt();

        boolean result=search_number(x,a);
        if(result){
            System.out.println("Your number is found");
        }
        else{
            System.out.println("Your number is not found");
        }
    }
    public static boolean search_number(int [][] x ,int a) {
        int i =0;
        while(i<x.length){
            int j=0;
            while(j<x.length){
                if(x[i][j]==a){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
