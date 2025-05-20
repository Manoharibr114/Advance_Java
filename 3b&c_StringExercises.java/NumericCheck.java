/*
 Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()
 */

package prog3;
import java.util.Scanner;

public class NumericCheck {

	    public static boolean isNumeric(String str) {
	        return str != null && str.matches("\\d+");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string to check if numeric: ");
	        String input = sc.nextLine();
	        if (isNumeric(input)) {
	            System.out.println("The string is numeric.");
	        } else {
	            System.out.println("The string is NOT numeric.");
	        }
	    }
	}


