import java.util.Scanner;

public class UserInputManipulation {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a value of any data type: ");

        // Read user input, assuming it's a double (you can change the data type as needed)
        double inputValue = scanner.nextDouble();

        // Display the input value
        System.out.println("You entered: " + inputValue);

        // Perform a manipulation (double the input value)
        double result = inputValue * 2;

        // Display the manipulated result
        System.out.println("After doubling, the result is: " + result);

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}