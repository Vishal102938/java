public class arr_sumavg {
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5,6,7,8,9,10};
        long sum = sum(x);

        float average = avg(x);
        System.out.println(sum);
        System.out.println(average);
    }

    public static long sum(int[] x){
        int i = 0;
        long sum = 0;
        while(i<x.length){
            sum = sum+x[i];
            i++;
        }
        return sum;
    }

    public static float avg(int [] x) {
        int i = 0;
        long sum = 0;
        while(i<x.length){
            sum = sum+x[i];
            i++;
        }
        return sum/(x.length);
    }
}
