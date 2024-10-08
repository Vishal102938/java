import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int b = sc.nextInt();

        int x[][] = new int[a][b];
        int y[][]= new int[a][b];

        System.out.println("Enter the elements:");
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                x[i][j] = sc.nextInt();
            }
        System.out.println();
        }
        
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                y[i][j] = x[j][i];
            }
        }

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(y[i][j]);
            }
            System.out.println();
        }
    }
}               


        
        
