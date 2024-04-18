package practice3_15_4_2024;
import java.util.*;
import java.util.Scanner;
/*Write the Java program that reads an input string and converts it to an integer, handling the exceptions 
 * if the input contains non-digits or if the input is larger than what an integer can store*/
public class IllegalArgumentDemo {
public static void convertInt(String input)
{int num=Integer.parseInt(input); 
		if(num>Integer.MAX_VALUE || num< Integer.MIN_VALUE)
		{
			throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE);
	try {
	System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	String num=sc.next();
	convertInt(num);
	System.out.println("The String converted successfully");
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
}


