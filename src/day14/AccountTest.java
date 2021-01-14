package day14;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter choice");
        String choice = input.next();

        Account account = null;
        switch (choice) {
            case "saving":
                account = new SavingAccount();
                break;
            case "current":
                account = new CurrentAccount();
                break;
            default:
                System.out.println("wrong choice");
        }

        if (account != null) {
            account.openAccount();
        }
    }
}
