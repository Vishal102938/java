import java.io.FileInputStream;
class checked
{
    public static void main(String[] args) 
    {
        try
        {
            FileInputStream f = new FileInputStream("d:/abc.text");
        }
        catch(Exception e)
        {
            System.out.println("Exception occur");
        }
    }    
}
