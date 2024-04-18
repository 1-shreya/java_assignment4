package practice3_15_4_2024;

public class CopyArray {
	public static void copyArray(int source[], int destination[]) {
		for (int i = 0; i < source.length; i++) {
			destination[i] = source[i];
		}
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	System.out.println();
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = new int[9];
		try {
			
			copyArray(arr1, arr2);
			System.out.println("Elements copied successfully");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size exceeds");
		} finally {
			System.out.println("1st array");
		    printArray(arr1);
			System.out.println("2ndarray");
			printArray(arr2);
		}

	}

}
