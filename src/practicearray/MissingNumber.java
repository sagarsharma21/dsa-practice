/**
 * 
 */
package practicearray;

/**
 * 
 */
public class MissingNumber {

	/**
	 * @param args
	 */
	static void findMissing(int[] arr, int n) {
	  // Create a temp array temp[] of size n + 1 with all initial values as 0.
		//int temp[] = new int[n+1];
		int sumn = ((n+1)*(n+2)) / 2;
		
		int arraySum = 0;
		 for(int i=0; i<n; i++) {
			arraySum += arr[i];
		}
		int ans = sumn-arraySum;
		System.out.print("Missing number: "+ans);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 1, 3, 7, 5, 6, 2 };
	     int n = arr.length;
	     
	     //function call
	     findMissing(arr, n);
	}

}
