class finally1 {
    public static void main(String[] args)
    {
        try{
            int a=100,b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
             System.out.println("Arithmetic Exception occur");
        }
        finally{
            System.out.println("hello");
        }
    }
}

