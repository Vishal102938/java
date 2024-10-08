import java.util.Scanner;

class Add {
    public void add(int... num) {
        int sum = 0;
        StringBuilder a = new StringBuilder();
        
        for (int i = 0; i < num.length; i++) {
            sum=sum+num[i];
            
            a.append(num[i]);
            if (i < num.length - 1) {
                a.append("+");
            }
        }
    
        System.out.println(a + "=" + sum);                    
    }
}
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Add adder = new Add();
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 1; i <= 6; i++) {
            int[] toAdd = new int[i];
            System.arraycopy(numbers, 0, toAdd, 0, i);
            adder.add(toAdd);
        }
    }
    
}
                                    