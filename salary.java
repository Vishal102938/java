import java.util.Scanner;
public class salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ABC");
        System.out.println("Enter your Employee name: "); 
        String Ename = sc.next();
        
        System.out.println("Enter Employee Id: ");
        String EId = sc.next();

        System.out.println("Enter Employee Department: ");
        String EDept =sc.next();

        System.out.println("Enter Empolyee Basic Salary: ");
        int ESalary = sc.nextInt();

        System.out.println("HRA: ");
        int HRA = (25/100)*ESalary;

        System.out.println("DA: ");
        int DA = (30/100)*ESalary;

        System.out.println("TA: ");
        int TA = (20/100)*ESalary;

        System.out.println("PF: ");
        int PF = (12/100)*ESalary;

        if(ESalary>=0 && ESalary<=320000){
            int TAX = (0/100)*ESalary;
        }

        else if(ESalary>=321000 && ESalary<=450000){
            int TAX = (12/100)*ESalary;
        }

        else if(ESalary>=451000 && ESalary<=699000){
            int TAX = (15/100)*ESalary;
        }
        else if(ESalary>=700000){
            int TAX = (20/100)*ESalary;
        }
        else
        {
            System.out.println("Inavalid");
    
        }

    }
}