package practice3_15_4_2024;
/*Create an integer array of size n and read the elements from the user .
 * Add an exception handling block to print the value at nth position of the array*/
import java.util.*;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int arr[] = new int[size];
		System.out.println("Enter Array Elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		try {
			System.out.println("Enter index position from 0 to 4");
			int pos = sc.nextInt();
			System.out.println("Value for the index at " + pos + " is " + arr[pos]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter valid position");
			System.out.println(e.getMessage());
		}
	}
}
