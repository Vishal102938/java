import java.util.*;
class main{
    static String encoded;
    public static void encode(String data){
        byte[] a = data.getBytes();
        encoded = Base64.getEncoder().encodeToString(a);
        System.out.println("Encoded:"+encoded);
    }

    public static void decode()
    {
        byte [] decodedbytes = Base64.getDecoder().decode(encoded);
        String decodedstring = new String(decodedbytes);
        System.out.println("Decode:"+decodedstring);
    }
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        encode(data);
        decode();
    }
}