import java.util.Scanner;

public class Where_should_use_whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a positive number: ");
        number = scanner.nextInt();

        while (number <= 0) {  // Runs until user enters a positive number
            System.out.print("Invalid! Enter again: ");
            number = scanner.nextInt();
        }

        System.out.println("You entered: " + number);
        scanner.close();
    }
}
