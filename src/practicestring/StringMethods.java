/**
 * 
 */
package practicestring;

/**
 * 
 */
public class StringMethods {

	/*
	 * 
	 * */

	public static void main(String[] args) {
		String s = "GeeksforGeeks";
		s.length();
		System.out.println(s.length());// 13

		s.substring(2);// eksforGeeks
		System.out.println(s.substring(2));

		s.substring(2, 4);// from ith index to j-1 index
		System.out.println(s.substring(2, 4)); // ek

		String r = "LPU";
		s.concat(r);// GeeksforGeeksLPU
		System.out.println(s.concat(r));

		s.indexOf("for");
		System.out.println(s.indexOf("for")); // 5
		
		String s1 = "bow bow";
		System.out.println(s1.indexOf("bow", 3)); // 4

		System.out.println(s1.lastIndexOf("o")); // 5

		System.out.println(s1.equals("Bow bow")); // false

		System.out.println(s1.equalsIgnoreCase("Bow bow")); // true

		int x = s1.compareTo("meow");
		System.out.println(x);

		int x2 = s1.compareToIgnoreCase("meow");
		System.out.println(x2);

		System.out.println(s1.toLowerCase());// bow bow
		System.out.println(s1.toUpperCase());// BOW BOW

		String demo = s1.concat(" trim here  ");
		System.out.println(demo.trim());

		System.out.println(s1.contains("ow")); // true

		System.out.println(s1.replace('b', 'c') + " -> replaced");

		String amt = "Rs 1000";
		System.out.println(amt.substring(3));
	}
}
