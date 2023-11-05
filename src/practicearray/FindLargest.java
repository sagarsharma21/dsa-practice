/**
 * 
 */
package practicearray;

import java.util.Arrays;

/**
 * 
 */
public class FindLargest {

	
	static void print2largest(int[] arr, int n){
		if(arr.length< 2) {
			System.out.print("Invalid input");
		}
		Arrays.sort(arr);
		for(int i=0; i<n ;i++) {

			//System.out.print(arr[i]+" ");	
			
		}
		
		//printing 2nd largest
		if(arr[n-2] == arr[n-1]) { System.out.print("No such element");}
		
		else {
			System.out.print(arr[n-2]);
		}
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 35, 1, 10, 34, 1}; 
		  int n = arr.length; 
		  print2largest(arr, n); 
	}

}
