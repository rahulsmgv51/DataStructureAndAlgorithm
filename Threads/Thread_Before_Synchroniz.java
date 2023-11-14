package Threads;
import java.util.Scanner;

class Account {
    private int balance;
    public Account(int balance) {
        this.balance = balance;
    }
    public boolean isSufficientBalance(int withdrawlAmt) {
        if (balance > withdrawlAmt) {
            return true;
        } else {
            return false;
        }
    }

    public void withdraw(int amt) {
        balance = balance - amt;
        System.out.println("Withdrawl money is  " + amt);
        System.out.println("Your Current balance is " + balance);
    }
}

class Customer implements Runnable {
    private Account account;
    private String name;

    public Customer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        Scanner scn = new Scanner(System.in);
        System.out.println(name + ", Enter amount to withdrawl");
        int amt = scn.nextInt();

        if (account.isSufficientBalance(amt)) {
            System.out.println(name);
            account.withdraw(amt);
        } else {
            System.out.println("InSufficient Balance");
        }
    }

}

public class Thread_Before_Synchroniz {
    public static void main(String[] args) {
        Account acc1 = new Account(1000);
        Customer c1 = new Customer(acc1, "Rahul"), c2 = new Customer(acc1, "Rantesh");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
