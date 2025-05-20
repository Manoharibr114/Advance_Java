/* Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString(). */

package prog3;

import java.util.Scanner;

public class StringReversal {
	
	    // User-defined function to reverse a string
	    public static String reverseString(String str) {
	        if (str == null) {
	            return null;
	        }
	        return new StringBuilder(str).reverse().toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();

	        String reversed = reverseString(input);
	        System.out.println("Reversed string: " + reversed);

	        scanner.close();
	    }
	}


