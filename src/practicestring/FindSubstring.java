/**
 * 
 */
package practicestring;

/**
 * 
 */
public class FindSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Check if a string is a substring of another using STL:
		 * 
		 */
		String s1 = "la";
		String s2 = "Laung da lashkara";

		int res = isSubstring(s1, s2);
		System.out.println("The substring is present at index: " + res);

	}

	static int isSubstring(String s1, String s2) {

		if (s2.indexOf(s1) > 0) {
			return s2.indexOf(s1);
		}
		return 1;
		}

}
