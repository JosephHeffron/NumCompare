import java.util.Scanner;

public class NumCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = 0, num2 = 0;

        // Check if the input is a valid number
        try {
            num1 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        System.out.println("Enter the second number:");

        // Check if the input is a valid number
        try {
            num2 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return;
        }

        // Compare the numbers and display the result
        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else {
            System.out.println("The lesser number is: " + Math.min(num1, num2));
        }

        scanner.close();
    }
}
