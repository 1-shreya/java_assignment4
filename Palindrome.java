package practice3_15_4_2024;

/*.Write a Java method to check if an input string 
 * is a palindrome (Use String functions).*/
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string:");
		String str = sc.next();

		StringBuilder str1 = new StringBuilder(str);
		str1.reverse();

		if (str.equals(str1.toString())) {
			System.out.println("It is Palindrome String");
		} else {
			System.out.println("It is Not a palindrome String");
		}
	}
}
