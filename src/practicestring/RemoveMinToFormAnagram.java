/**
 * 
 */
package practicestring;

/**
 * 
 */
public class RemoveMinToFormAnagram {

	/**
	 * @param args
	 * 
	 *             Find minimum number of characters to be deleted to make both the
	 *             strings anagram
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "dog";
		String s2 = "doge";

		removeMinToFormAnagram(s1, s2);
		System.out.println();
	}

	static void removeMinToFormAnagram(String s1, String s2) {
		int count1 = new int[26];
		int count2 = new int[26];

	}

}
