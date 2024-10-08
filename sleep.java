public class sleep extends Thread {
    public void run()
    {
        Thread.yield();
        for(int i = 1;i<=5;i++)
        {
           
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
    public static void main(String[] args) {
        sleep p =new sleep();
        p.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
