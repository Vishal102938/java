public class sum_array1 {
    public static void main(String[] args) {
        int sum = 0;

        int [] marks = {10,20,30,40,50};

        for(int i=0;i<marks.length;i++){
            sum=sum+marks[i];

        }
        System.out.println(sum);
    }
    
}
