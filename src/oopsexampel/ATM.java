package oopsexampel;
import java.util.Scanner;
        public class ATM {
            private double balance = 10000; // initial balance
            private int pin = 1234;

            // PIN check
            public boolean checkPin(int enteredPin) {
                return enteredPin == pin;
            }

            // Check Balance
            public void checkBalance() {
                System.out.println("Current Balance: " + balance);
            }

            // Deposit
            public void deposit(double amount) {
                balance += amount;
                System.out.println("Deposited: " + amount);
            }

            // Withdraw
            public void withdraw(double amount) {
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawn: " + amount);
                } else {
                    System.out.println("Insufficient Balance!");
                }
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                ATM atm = new ATM();

                System.out.print("Enter PIN: ");
                int userPin = sc.nextInt();

                if (atm.checkPin(userPin)) {
                    int choice;

                    do {
                        System.out.println("\n1. Check Balance");
                        System.out.println("2. Deposit");
                        System.out.println("3. Withdraw");
                        System.out.println("4. Exit");
                        System.out.print("Choose option: ");

                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                atm.checkBalance();
                                break;

                            case 2:
                                System.out.print("Enter amount: ");
                                double dep = sc.nextDouble();
                                atm.deposit(dep);
                                break;

                            case 3:
                                System.out.print("Enter amount: ");
                                double wit = sc.nextDouble();
                                atm.withdraw(wit);
                                break;

                            case 4:
                                System.out.println("Thank you!");
                                break;

                            default:
                                System.out.println("Invalid choice!");
                        }

                    } while (choice != 4);

                } else {
                    System.out.println("Wrong PIN!");
                }

                sc.close();
            }
        }

