/*
 Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate() */
package prog3;

import java.util.Scanner;

public class StringTruncation {
	  public static String truncate(String str, int length) {
	        if (str.length() <= length) {
	            return str;
	        }
	        return str.substring(0, length) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();
	        System.out.print("Enter max length: ");
	        int len = sc.nextInt();
	        System.out.println("Truncated: " + truncate(input, len));
	    }
	

}
