package oopsexampel;

public class oopsEx1{

}
    class BankAccount {
        private int balance;

        public void setBalance(int b) {
            if (b >= 0) {
                balance = b;
            } else {
                System.out.println("Invalid balance");
            }
        }

        public int getBalance() {
            return balance;
        }

        public static void main(String[] args) {
            BankAccount acc = new BankAccount();
            acc.setBalance(5000);
            acc.setBalance(-100); // invalid

            System.out.println(acc.getBalance());
        }
    }

