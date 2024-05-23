import java.util.Scanner;

public class CustomStringConcatenation {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Concatenate the strings using the custom method
        String concatenatedString = concatenateStrings(str1, str2);

        // Print the concatenated result
        System.out.println("Concatenated string: " + concatenatedString);
    }

    // Custom method to concatenate two strings
    public static String concatenateStrings(String str1, String str2) {
        // Determine the length of the new concatenated string
        int length1 = str1.length();
        int length2 = str2.length();
        char[] result = new char[length1 + length2];

        // Copy characters from the first string to the result array
        for (int i = 0; i < length1; i++) {
            result[i] = str1.charAt(i);
        }

        // Copy characters from the second string to the result array
        for (int i = 0; i < length2; i++) {
            result[length1 + i] = str2.charAt(i);
        }

        // Convert the result array to a string and return
        return new String(result);
    }
}
