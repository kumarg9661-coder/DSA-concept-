package oopsexampel;

public class AbstractEx1 {
    static abstract class Bank {
        abstract int getInterestRate();
    }

    static class SBI extends Bank {
        int getInterestRate() {
            return 6;
        }
    }

    static class HDFC extends Bank {
        int getInterestRate() {
            return 7;
        }
    }
        public static void main(String[] args) {
            Bank b;

            b = new SBI();
            System.out.println("SBI Rate: " + b.getInterestRate());

            b = new HDFC();
            System.out.println("HDFC Rate: " + b.getInterestRate());
        }
    }

