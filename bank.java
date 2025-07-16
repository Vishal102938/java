import java.util.Scanner;

public class bank {
    String Account_holder_name;
    String IFSC_code;
    static double balance=0.0;

    static void passbook(String Account_holder_name){
        System.out.println("Hi,, Here's your PASSBOOK details:");
        System.out.println("ACCOUNT HOLDER'S NAME: "+Account_holder_name);
        System.out.println("IFSC Code: HELLO123JAVA");
        

    }
    static void Check_Balance(){
        System.out.println("Your Bank balance is:" +balance);

    }
    static void Deposit_amount(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Deposit successful:" +amount);
            System.out.println("Your overall Banke balance is:" +balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    static void Withdraw_amount(double amount){
        if(amount>0 && amount<=balance){
            balance=balance-amount;
            System.out.println("Withdrawn Successful:" +amount);
            System.out.println("Your rest Bank balance is:" +balance);
        }
        else{
            System.out.println("Insufficient amount");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit Balance");
            System.out.println("3.Withdraw Balance");
            System.out.println("4.Request for PASSBOOK");
            System.out.println("5.Exit");
            System.out.print("Enter your choice:");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                Check_Balance();
                break;

                case 2:
                System.out.print("Enter the amount for Deposit:");
                double deposit_money= sc.nextDouble();
                Deposit_amount(deposit_money);
                break;

                case 3:
                System.out.println("Enter the amount for Withdraw:");
                double withdraw_money=sc.nextDouble();
                Withdraw_amount(withdraw_money);
                break;

                case 4:
                System.out.print("Enter the Name:");
                String Account_holder_name=sc.next();
                passbook(Account_holder_name);
                Check_Balance();
                break;

                case 5:
                System.out.println("THANKS FOR VISTIING OUR BANK");
                break;

                 default:
                System.out.println("Hello");
            }   
        }
    }
}