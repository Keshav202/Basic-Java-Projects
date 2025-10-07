import java.util.Scanner;
class ATMInterface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n..Welcome to ATM..");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.println("\nSelect your Choice");
        int choice = input.nextInt();

        double balance = 1000.0;
        if (choice == 1){
            System.out.println("Your current Balance is : " + balance);
        }
        if (choice == 2){
            System.out.print("Enter the Deposit Amount : ");
            double depositAMT = input.nextDouble();

            if (depositAMT > 0){
                balance += depositAMT;
                System.out.println("Your current Balance is : " + balance);
            }else {
                System.out.println("Invalid Amount");
            }
        }

        if (choice == 3){
            System.out.print("Enter the Amount for Withdraw : ");
            double withdrawAMT = input.nextDouble();

            if (withdrawAMT <= balance){
                System.out.println("Transaction Completed.");
                balance -= withdrawAMT;
                System.out.println("Your current Balance is : " + balance);

            }else if (withdrawAMT > balance){
                System.out.println("Insufficient Balance");
            }else {
                System.out.println("Invalid Amount.");
            }

        }

        if (choice == 4){
            System.out.println("You are out of ATM.");
        }
    }
}
