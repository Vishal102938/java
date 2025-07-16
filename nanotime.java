public class nanotime {
    public static void main(String[] args) {
        long start,end;
        start =System.nanoTime();
        for(int i=0;i<50;i++)
        {
            System.out.println("Vishal");
        }
        end=System.nanoTime();
        System.out.println(start);
        System.out.println(end);
        System.out.println(end-start);
    }
}
