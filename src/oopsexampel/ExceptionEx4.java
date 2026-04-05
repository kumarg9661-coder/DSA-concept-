package oopsexampel;

    class InvalidAgeException extends Exception {
        public InvalidAgeException(String msg) {
            super(msg);
        }
    }
    class test{
        public static void main(String[] args) {
            int age = 15;

            try {
                if (age < 18) {
                    throw new InvalidAgeException("Not eligible!");
                } else {
                    System.out.println("Eligible");
                }
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

