public class display {
    public static void main(String[] args) {
        // First Methods pf Display

        int [] marks = {10,20,30,40,50,60};
        // Display using simple method:

        System.out.println("Display using simple method:");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        // Second method of Display
        // Display using for loop :

        System.out.println("Display using For loop:");

        for(int i=0;i<marks.length;i++)
        {
            System.out.println("Array elements are:");
            System.out.println(marks[i]);
        }

    }
    
}
