public class array2 {
    public static void main(String[] args) {
        int [][] marks = new int[2][3];

        marks[0][0] = 10;
        marks[0][1] = 20;
        marks[0][2] = 30;
        marks[1][0] = 40;
        marks[1][1] = 50;
        marks[1][2] = 60;

        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
    
}
