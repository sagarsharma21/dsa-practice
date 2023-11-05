/**
 * 
 */
package practicestring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * 
 */
public class Anagram {

	/**
	 * @param args
	 * 
	 *             Given two strings. The task is to check whether the given strings
	 *             are anagrams of each other or not. Input: str1 = “listen” str2 =
	 *             “silent” Output: “Anagram”
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "arm";
		String s2 = "ram";

		// boolean res = checkAnagram(s1, s2);
		boolean res = checkAnagramUsingHashmap(s1, s2);

		if (res == true)
			System.out.print("Anagram exists!");
		else
			System.out.println("Not found!");

	}

	static boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			char[] a = s1.toCharArray();
			char[] b = s2.toCharArray();

			Arrays.sort(a); // arm -> arm
			Arrays.sort(b); // ram -> arm

			for (int i = 0; i < s1.length(); i++) {
				if (a[i] != b[i])
					return false;
			}
		}

		return true;
	}

	static boolean checkAnagramUsingHashmap(String s1, String s2) {

		if (s1.length() != s2.length()) {
			return false;
		}

		// Create a Hashmap containing all characters of a
		HashMap<Character, Integer> map = new HashMap<>();
		
		//Loop over the characters of string a and put it to Hashmap
			for(int i=0; i<s1.length(); i++) {
				if(map.containsKey(s1.charAt(i))){
					map.put(s1.charAt(i), map.get(s1.charAt(i)) +1);
				}
				
				else {
	                // else put that character in map and set
	                // count to 1 as character is encountered
	                // for the first time
	                map.put(s1.charAt(i), 1);
	            }

			}
		

			// Now loop over string s2

			for (int i = 0; i < s2.length(); i++) {
				if (map.containsKey(s2.charAt(i))) {
					map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
			}
			else {
				return false;
			}

		}

		// Check for keys
		Set<Character> mykeys = map.keySet();
		// Loop over all keys and check if all are 0
		// It means anagram found
		for (Character k : mykeys) { // k is iterator over keys
			if (map.get(k) != 0) {
				return false;
			}
		}
		// Return true as all keys are zero

		return true;
	}

}
// Using sorting approach
// Time complexity :  O(N * log N)
// Space complexity: O(1)

//Using Hashmap
// Time complexity: O(N)
// Space complexity: O(N)