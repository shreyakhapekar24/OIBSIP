import java.net.SocketPermission;
import java.util.Scanner;

import javax.xml.catalog.Catalog;

class AtmInterface {
    String name, userName, passWord, accNo;
    float balance = 200000;
    int transactions = 0;
    String transactionHistory = "";

    public void register() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        this.name = sc.nextLine();

        System.out.println("Enter your Username: ");
        this.userName = sc.nextLine();

        System.out.println("Enter your password: ");
        this.passWord = sc.nextLine();

        System.out.println("Enter your Account Number: ");
        this.accNo = sc.nextLine();

        System.out.println("Registration has been completed. Kindly login.");
    }

    public boolean login() {
        boolean isLogin = false;
        Scanner sc = new Scanner(System.in);

        while (!isLogin) {
            System.out.println("Enter your Username: ");
            String UN = sc.nextLine();

            if (UN.equals(userName)) {
                while (!isLogin) {
                    System.out.println("Enter your password: ");
                    String PW = sc.nextLine();
                    if (PW.equals(passWord)) {
                        System.out.println("Login successfull !");
                        isLogin = true;
                    } else {
                        System.out.println("Incorrect password");
                    }
                }
            } else {
                System.out.println("Username not found ");
            }
        }
        return isLogin;
    }

    public void withDraw() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to withdraw: ");
        float amount = sc.nextFloat();

        try {
            if (balance >= amount) {
                transactions++;
                balance = balance - amount;
                System.out.println("Amount has been withdrawn successfully. ");

                String str = "RS." + amount + " withdrawn.\n";
                transactionHistory = transactionHistory.concat(str);
            } else {
                System.out.println("Insufficient balance. ");
            }
        } catch (Exception e) {
        }
    }

    public void deposit() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to deposit: ");
        float amount = sc.nextFloat();

        try {
            if (amount <= 100000f) {
                transactions++;
                balance = balance + amount;
                System.out.println("Amount has been deposited successfully. ");

                String str = "Rs." + amount + " deposited.\n";
                transactionHistory = transactionHistory.concat(str);
            } else {
                System.out.println("Limit exceeded! (Limit = 100000.00)");
            }
        } catch (Exception e) {
        }
    }

    public void transfer() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter recipient's name: ");
        String recepient = sc.nextLine();

        System.out.println("Enter amount to transfer: ");
        float amount = sc.nextFloat();

        try {
            if (balance >= amount) {
                if (amount <= 50000f) {
                    transactions++;
                    balance = balance - amount;
                    System.out.print("Amount has been transferred successfully. ");

                    String str = "Rs." + amount + " transferred to " + recepient + "\n";
                    transactionHistory = transactionHistory.concat(str);
                } else {
                    System.out.println("Limit exceeded! (Limit = 50000.00)");
                }
            } else {
                System.out.println("Insufficient Balance");
            }
        } catch (Exception e) {
        }
    }

    public void checkBalance() {
        System.out.println("Rs." + balance);
    }

    public void transHistory() {
        if (transactions == 0) {
            System.out.println("No transaction has been done");
        } else {
            System.out.println(transactionHistory);
        }
    }
}

public class task2 {
    public static int takeIntegerInput(int limit) {
        int input = 0;
        boolean flag = false;

        while (!flag) {
            try {
                Scanner sc = new Scanner(System.in);
                input = sc.nextInt();
                flag = true;

                if (flag && input > limit || input < 1) {
                    System.out.println("Choose the number between 1 and " + limit);
                    flag = false;
                }
            } 
            catch (Exception e) {
                System.out.println("Enter only integer value: ");
                flag = false;
            }
        };
        return input;
    }

    public static void main(String[] args) {
        System.out.println("======ATM INTERFACE======");
        System.out.println("1. Register. \n2. Exit");
        System.out.println("Enter your choice: ");
        int choice = takeIntegerInput(2);

        if(choice==1){
            AtmInterface a = new AtmInterface();
            a.register();
            while(true){
                System.out.println("1. login \n2. Exit");
                System.out.println("Enter your choice: ");
                int ch = takeIntegerInput(2);
                if(ch == 1){
                    if(a.login()){
                        System.out.println("\n\n**********WELCOME BACK " + a.name + "**********\n");

                        boolean isFinished = false;
                        while(!isFinished){
                            System.out.println("\n1. Withdraw \n2. Deposit \n3. Transfer \n4. Check Balance \n5. Transactions History \n6. Exit1");
                            System.out.println("Enter your choice: ");
                            int c = takeIntegerInput(6);

                            switch(c){
                                case 1:
                                a.withDraw();
                                break;
                                
                                case 2:
                                a.deposit();
                                break;

                                case 3:
                                a.transfer();
                                break;

                                case 4:
                                a.checkBalance();
                                break;

                                case 5:
                                a.transHistory();
                                break;

                                case 6:
                                isFinished = true;
                                break;
                            }
                        }
                    }
                }
                else{
                    System.exit(0);
                }
            }
        }
        else{
            System.exit(0);
        }
    }
}
