package com.banking;
import java.util.*;

public class main {
    static HashMap<Integer, Account> account = new HashMap();
    static int currentAccountNumber = 1000;

    public main() {
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true) {
            while(true) {
                String choice = s.nextLine();
                switch(choice) {
                    case "Create":
                        createOption(s);
                        break;
                    case "Deposit":
                        depositOption(s);
                        break;
                    case "Withdraw":
                        withdrawOption(s);
                        break;
                    case "Balance":
                        balanceOption(s);
                        break;
                    case "Transfer":
                        transferOption(s);
                        break;
                    case "Exit":
                        System.exit(0);
                }
            }
        }
    }

    private static void transferOption(Scanner s) {
        System.out.println("Enter giver account number , receiver account number and amount ot transfer");
        int giveAccountNo = s.nextInt();
        int receiveAccountNo = s.nextInt();
        int amount = s.nextInt();
        (new bank()).transfer(giveAccountNo, receiveAccountNo, amount, account);
    }

    private static void balanceOption(Scanner s) {
        System.out.println("Enter account number:");
        int accNo = s.nextInt();
        (new bank()).balance(accNo, account);
    }

    private static void withdrawOption(Scanner s) {
        System.out.println("Enter account number and amount to withdraw:");
        int accNo = s.nextInt();
        int amount = s.nextInt();
        (new bank()).withdraw(accNo, amount, account);
    }

    private static void depositOption(Scanner s) {
        System.out.println("Enter account number and amount to deposit:");
        int accNo = s.nextInt();
        int amount = s.nextInt();
        (new bank()).deposit(accNo, amount, account);
    }

    private static void createOption(Scanner s) {
        System.out.println("Enter your name:");
        String name = s.next();
        ++currentAccountNumber;
        (new bank()).createAccount(name, currentAccountNumber, account);
        System.out.println(currentAccountNumber);
    }
}

