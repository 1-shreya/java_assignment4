package practice3_15_4_2024;
/*Write a program to calculate the square value of any number given by the user .
 * Add an exception handling block to check whether the user enter letters instead of numbers*/
import java.util.*;
public class square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Eneter a number:");
		
		try {
			String number=sc.next();
			int num=Integer.parseInt(number);
			System.out.println("Square of entered number is:"+(num*num));
			
		}
		catch(Exception e)
		{
			System.out.println("Enter valid input");
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("Thank you...!!!!!!");
		}

	}

}
