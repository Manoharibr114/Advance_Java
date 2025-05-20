/*
 Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()
 */
package prog3;
import java.util.Scanner;
public class WordCounter {
	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) return 0;
	        return str.trim().split("\\s+").length;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String input = sc.nextLine();
	        System.out.println("Word count: " + countWords(input));
	    }
	}


