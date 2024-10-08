public class array {
    public static void main(String[] args) {
        int [] x = new int[5];
        System.out.println("The element of the first array is: ");
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 40;
        x[4] = 50;

        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[4]);
    

    int [] y = {10,20,30,40,50};
    System.out.println("The element of the second array is:");
    System.out.println(y[0]);
    System.out.println(y[1]);
    System.out.println(y[2]);
    System.out.println(y[3]);
    System.out.println(y[4]);
    
    
System.out.println("The element of third array is:");
    int i = 0;
    for(i=0;i<x.length;i++){
        System.out.println(x[i]);
    }

    System.out.println("The element of fourth array is:");
    int j = 0;
    while(j<x.length){
        System.out.println(x[j]);
        j++;
    }
    }
}
