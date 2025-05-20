/* Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():  */


package prog3;
import java.util.Scanner;
public class PalindromeCheck {

	    // User-defined function to reverse a string
	    public static String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }

	    // User-defined function to check if a string is a palindrome (ignoring case and punctuation)
	    public static boolean isPalindrome(String str) {
	        if (str == null) return false;

	        // Remove non-alphanumeric characters and convert to lowercase
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversed = reverseString(cleaned);

	        return cleaned.equals(reversed);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to check if it is a palindrome: ");
	        String input = scanner.nextLine();

	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        scanner.close();
	    }
	}


