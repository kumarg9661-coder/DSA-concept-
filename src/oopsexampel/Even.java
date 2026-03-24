import java.util.Scanner;

// Utility class for logic
public class Even {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }


    // Main class (entry point)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // Check if input is valid integer
        if (sc.hasNextInt()) {
            int num = sc.nextInt();

            if (Even.isEven(num)) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        sc.close();
    }
}
