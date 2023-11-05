/**
 * 
 */
package practicearray;

/**
 * 
 */
public class Largest3 {

	/**
	 * @param args
	 */
	
	static void print3largest(int[] arr) {
		int n= arr.length;
		int third ,second, first;
		first = second= third = Integer.MIN_VALUE;
		
		for (int i = 0; i < n; i++) {
			
			if(arr[i] > first ) {
				third = second;
				second = first;
				first = arr[i];

			}
			else if(arr[i] > second) {
				arr[i] = second;
				third = second;
			}
			else if(arr[i] > third) {
				arr[i] = third;
			}
			
		}
		
		System.out.print("The three largest are: "+first+", "+second+", "+third);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 12, 13, 1, 10, 34, 1, 91, 98, 187 };
	        int n = arr.length;
	        print3largest(arr);
	}

}
