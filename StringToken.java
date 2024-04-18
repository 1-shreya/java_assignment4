package practice3_15_4_2024;
/*7.Write a program to split a string containing two words 
 * using StringTokenizer without using hasMoreTokens() method and 
 * call nextToken() method three times.Add an exception handling block if necessary.
*/
import java.util.*;

public class StringToken {

	public static void main(String[] args) {
		/*
		 * StringTokenizer st = new
		 * StringTokenizer("Good morning Shreya Shinde How are you?"); 
		 * String token1=st.nextToken(); System.out.println(token1);
		 *  while(st.hasMoreTokens())
		 * { System.out.println(st.nextToken());
		 * 
		 * }
		 */
		/* Without using has more when 2 tokens are there and handling exception */
		StringTokenizer st = new StringTokenizer("This is Shreya Shinde");
		try {
			String token1 = st.nextToken();
			System.out.println(token1);
			String token2 = st.nextToken();
			System.out.println(token2);
			String token3 = st.nextToken();
			System.out.println(token3);
			String token4 = st.nextToken();
			System.out.println(token4);
		} catch (Exception e) {
			System.out.println("No More Additional Tokens");
		}

	}

}
