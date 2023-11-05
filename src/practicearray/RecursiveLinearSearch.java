/**
 * 
 */
package practicearray;

/**
 * 
 */
public class RecursiveLinearSearch {

	/**
	 * @param args
	 */
	public static void recursiveLinearSearch(int[] arr, int size, int x) {
		if (size < 1) {
			System.out.println("Not found");
			return;
		}
		else if (arr[size - 1] == x) {
			System.out.println("Element is found at position: " + (size));
		} else
			recursiveLinearSearch(arr, size - 1, x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int x = 70;
		recursiveLinearSearch(arr, arr.length, x);
		System.out.print("");

	}

}
