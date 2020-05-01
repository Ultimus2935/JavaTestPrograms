import java.io.IOException;

import java.util.Scanner;

public class Bank {

    Scanner sc = new Scanner(System.in);

    private String denom;

    private long currentBal;

    private boolean running = true;

    Bank(int default_bal, String denomination) {

        denom = denomination;
        currentBal = default_bal;

    }

    String getBal() {

        // Get Balance
        return "Your balance is " + denom + currentBal;

    }
 
    void checkBal () {

        System.out.println("=======================================================================");
        System.out.println(getBal());
        System.out.println("=======================================================================");
    
    }

    void depositMoney() {

        // Deposit

        System.out.println("=======================================================================\n");
        System.out.print("Enter the amount to be deposited: Rs. ");
        
        long depositAmount = sc.nextInt();
        System.out.println("\n=======================================================================");

        currentBal += depositAmount;

        System.out.println("Your amount has been deposited.");
        System.out.println("=======================================================================");
        System.out.println(getBal());
        System.out.println("=======================================================================");
    
    }

    void withdrawMoney () {

        // Withdrawal

        System.out.println("=======================================================================\n");
        System.out.print("Enter the amount to be withdrawn: Rs. ");
        
        long withdrawalAmount = sc.nextInt();
        System.out.println("");
        System.out.println("=======================================================================");

        if (withdrawalAmount < currentBal) {
            currentBal -= withdrawalAmount;

            System.out.println("Your amount has been withdrawn. \n");
            System.out.println("=======================================================================\n");
        } else {
            System.out.println("Your account does not contain adequate balance for this withdrawal.");
            System.out.println("Your amount has not been withdrawn.");
            System.out.println("Please try to withdraw a viable amount. ");
            System.out.println("=======================================================================");
        }

        System.out.println(getBal());
        System.out.println("=======================================================================");

    }

    void clearScreen() {

        // TEST CODE IS NOT IMPLEMENTED IN MAIN PROGRAM

        System.out.print("\033[H\033[2J"); //or use System.out.print("\f"); in case of BlueJ
        
        System.out.flush();

    }

    public void promptEnterKey () throws IOException {

        System.out.println();
        System.out.println("Press ENTER or RETURN to continue...");

        System.in.read();

    }

    public void menuScreen () throws IOException {

        //Menu
        System.out.println("=======================================================================");
        System.out.println("=          Welcome to THIS BANK, The most THIS of all Banks.          =");
        System.out.println("=======================================================================");

        System.out.println("=======================================================================");
        System.out.println("= Choose your action:                                                 =");
        System.out.println("=   1. Check Balance                                                  =");
        System.out.println("=   2. Deposit                                                        =");
        System.out.println("=   3. Withdrawal                                                     =");
        System.out.println("=======================================================================");
        System.out.print("=   Action: ");

        byte choice = sc.nextByte();

        System.out.println("=======================================================================");
        System.out.println();


        switch (choice) {

            case 1:
                // Check Balance
                checkBal();

                promptEnterKey();

                break;

            case 2:
                // Deposit
                depositMoney();

                promptEnterKey();

                break;

            case 3:
                // Withdrawal
                withdrawMoney();

                promptEnterKey();

                break;

            default:
                System.out.println("This is function is not specified in the Bank's program or is temporarily unavailable.");
                System.out.println("Please try another valid action................. or i will steal ur cookies and delete you minecraft account.........");

                promptEnterKey();

                break;

        }      

    }

    public static void main(String[] args) throws Exception {

        Bank bank = new Bank(2000, "Rs. ");

        while(bank.running) {

            bank.menuScreen();

            System.out.println("\n");

        }

    }
}