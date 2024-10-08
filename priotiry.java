class prio extends Thread{
    public void run()
    {
        System.out.println("hello");
        System.out.println(Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());

        prio p = new prio();
        p.start();
    }
    
}
