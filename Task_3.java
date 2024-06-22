//Task 3

package CodSoft;

import java.util.Scanner;

class Account{

    double balance;

    public Account(int amt){
        balance = amt;
    }

    public double getbalance(){
        return balance;
    }

    public void deposit(double amt){
        balance += amt;
    }

    public boolean withdrawl(double amt){
        if (amt<=balance){
            balance -= amt;
            return true;
        }
        return false;
    }

}

class Atm {
    Account user;

    public Atm(Account account){
        user = account;
    }

    public void display() {
        System.out.println("1 - Check Balance ");
        System.out.println("2 - Deposit ");
        System.out.println("3 - Withdrawl ");
        System.out.println("4 - Exit ");
    }

    public void run() {
        int option;
        do {
            display();
            Scanner sc = new Scanner(System.in);

            System.out.println("enter option : ");
            option = sc.nextInt();

            if (option == 1) {
                System.out.println(user.getbalance());
            } else if (option == 2) {
                System.out.println("Enter the amount : ");
                double amt = sc.nextDouble();
                user.deposit(amt);

            } else if (option == 3) {
                System.out.println("Enter the amount : ");
                double amt = sc.nextDouble();
                if (!user.withdrawl(amt)) {
                    System.out.println("insufficient balance ");
                }

            } else if (option == 4) {
                System.out.println("Thanks for using Atm ");
            } else {
                System.out.println("invalid option ");
            }
        }while(option!=4);
    }

}

public class Task_3{
    public static void main(String[] args) {
        Account user = new Account(1000);
        Atm atm = new Atm(user);

        atm.run();
    }
}

