class unchecked {
    public static void main(String[] args) {
        try{
            int a=50,b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("here is Arithmatic exception occur");
        }
    }
}
