/**
 * 
 */
package practicearray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

public class PairwithGivenSum {

	static void pairWithGivenSum(int[] nums, int x) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == x)
					// System.out.println(j + ": is j");
					System.out.println("Pair found at (" + nums[i] + ", " + nums[j] + ")");
			}

		}
	}

	/*
	 * */
	static void pairWithGivenSumUsingSort(int nums[], int x) {

		Arrays.sort(nums);

//		for (int thisitem : nums) {
//			System.out.println(thisitem);
//
//		}
		int low = 0; // setting low & high indices for comparison
		int high = nums.length - 1;
		// for (int c = 0; c < nums.length; c++) {
		while (low < high) {
			if (nums[low] + nums[high] == x) {
				System.out.println("Pair : (" + nums[low] + ", " + nums[high] + ")");
				return;
			} else if (nums[low] + nums[high] < x) {
				low++;
			} else {
				high--;
			}
		}
			
			// }


	}

	/*
	 * 
	 * */
	static void pairWithGivenSumUsingHash(int nums[], int x) {

		// create an empty HashMap
		Map<Integer, Integer> map = new HashMap<>();

		// do for each element
		for (int i = 0; i < nums.length; i++) {
			// check if pair (nums[i], target-nums[i]) exists

			// if the difference is seen before, print the pair
			if (map.containsKey(x - nums[i])) {
				System.out.printf("Pair found (%d, %d)", nums[map.get(x - nums[i])], nums[i]);
				return;
			}

			// store index of the current element in the map
			map.put(nums[i], i);
		}

		// we reach here if the pair is not found
		System.out.println("Pair not found");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 8, 7, 2, 5, 3, 1, 5 };
		int target = 10;

		// pairWithGivenSum(nums, target);//using naive approach T(C) = O(n^2)

		//pairWithGivenSumUsingSort(nums, target);// using sorting

		pairWithGivenSumUsingHash(nums, target);// using Hash Set
	}

}
