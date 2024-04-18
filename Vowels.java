package practice3_15_4_2024;
/*Write a JAVA program to create a method that takes a string as input 
 and throws an exception if the string does not contain vowels.*/
import java.util.*;

class NoVowels extends Exception {
	public NoVowels(String msg) {
		super(msg);
	}
}

public class Vowels {
	public static void Vowels(String input) throws NoVowels {
		boolean containsVowels = false;
		String vw = "aeiouAEIOU";
		for (int i = 0; i < input.length(); i++) {
			char test = input.charAt(i);
			if (vw.contains(String.valueOf(test))) {
				containsVowels = true;
				break;
			}
		}
		if (!containsVowels) {
			throw new NoVowels("no vowels");
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		try {
			String input = sc.next();
			Vowels(input);
			System.out.println("contains vowel");

		} catch (NoVowels e) {
			System.out.println(e.getMessage());
		}

	}
}