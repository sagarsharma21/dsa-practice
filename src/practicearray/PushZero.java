/**
 * 
 */
package practicearray;

/**
 * 
 */
public class PushZero {

	/**
	 * @param args
	 */
	// Function to push zeroes to the end of the array
	static void pushZerosToEnd(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		while (count < n) {
			arr[count++] = 0;
		}

	}

	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0 };
		int n = arr.length;
		pushZerosToEnd(arr, n);

		System.out.println("Array after pushing zeros to the end: ");
		printArray(arr);
		// System.out.println("Heyyy");
	}

}
