/* Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences() */


package prog3;
import java.util.Scanner;
public class SubstringCount{
	
	    // User-defined function to count substring occurrences
	    public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length(); // move past the last match
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the main string: ");
	        String mainStr = scanner.nextLine();

	        System.out.print("Enter the substring to count: ");
	        String subStr = scanner.nextLine();

	        int result = countOccurrences(mainStr, subStr);
	        System.out.println("The substring '" + subStr + "' appears " + result + " times.");

	        scanner.close();
	    }
	}

