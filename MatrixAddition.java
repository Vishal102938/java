import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int b = sc.nextInt();

        
        int[][] matrix1 = new int[a][b];
        int[][] matrix2 = new int[a][b];
        int[][] sum = new int[a][b];

        
        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

     
        System.out.println("Enter elements for the sescond matrix:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        
        System.out.println("Sum of the matrisces:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
