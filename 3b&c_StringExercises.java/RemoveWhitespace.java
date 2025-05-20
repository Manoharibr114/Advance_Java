/* Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace() */


package prog3;
import java.util.Scanner;
public class RemoveWhitespace {
	
	    // User-defined function to remove all whitespace characters
	    public static String removeWhitespace(String str) {
	        if (str == null) return null;
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to remove whitespace: ");
	        String input = scanner.nextLine();

	        String result = removeWhitespace(input);
	        System.out.println("String without whitespace: " + result);

	        scanner.close();
	    }
	}


