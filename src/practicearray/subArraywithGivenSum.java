/**
 * 
 */
package practicearray;

/**
 * 
 */
public class subArraywithGivenSum {

	public static boolean checkSubarraySum(int[] arr, int w, int sum) {
		int newsum = 0;
		int mark = -125;
		for (int i = 0; i < arr.length - w + 1; i++) {
			for (int j = 1; j <= w; j++) {

				newsum = newsum + arr[j];
				mark = j;
			}
			if (newsum == sum) {
				System.out.println("Subarray is: ");
				printsubarray(arr);

				System.out.println("Starts at index: " + mark);
				return true;
			}
		}

		return false;
	}

	static void printsubarray(int[] arr) {

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 4, 2, 10, 2, 20 };
		int k = 4;
		int sum = 34;// 18;

		int n = arr.length;

		if (checkSubarraySum(arr, k, sum))
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
