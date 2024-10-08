public class array_1 {
    public static void main(String[] args){
        int [] marks = new int[5]; 

        // print marks

        marks[0] = 10;
        marks[1] = 20;

        // length is 5 and we're accssing 6th element
        //it will give error
        marks[4] = 30;

       //error
       //  System.out.println(marks[5]);

        //accessing undefined index value 
        // it will give 0 bcoz default value of array after creation is "0"

    

        System.out.println(marks[3]);
    }
    
}
