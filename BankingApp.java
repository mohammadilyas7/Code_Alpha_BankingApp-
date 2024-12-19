import java.util.Scanner;

public class BankingApp {
    private static double balance = 0.0;
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        boolean exit = false;
        System.out.println("\nSimple Banking System");
       while (!exit){
           System.out.println("1. Deposit");
           System.out.println("2. Withdraw");
           System.out.println("3. Check Balance");
           System.out.println("4. Exit");
           System.out.print("Please select an option: ");
           int choice = scan.nextInt();
           switch (choice){
               case 1:
                   deposit();
                   break;
               case 2:
                   withdraw();
                   break;
               case 3:
                   checkBalance();
                   break;
               case 4:
                   System.out.println("Thank you for using banking application");
                   exit = true;
                   break;
               default:
                   System.out.println("Invalid option. Please try again.");
           }
       }
    }

    private static void deposit(){
        System.out.println("Enter the amount to deposit");
        double amount = scan.nextDouble();
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit successful your balance now : "+balance);
        }else{
            System.out.println("Invalid Amount Deposit failed");
        }
    }
    private static void withdraw(){
        System.out.println("Enter the amount to withdraw");
        double amount = scan.nextDouble();
        if (balance > amount){
            balance -= amount;
            System.out.println("withdraw successful your balance now : "+balance);
        }else{
            System.out.println("Insufficient Balance ");
        }
    }
    private static void checkBalance() {
        System.out.println("Your current balance is : "+balance);
    }
}