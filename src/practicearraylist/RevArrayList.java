/**
 * 
 */
package practicearraylist;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 */
public class RevArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < length; i++) {
			al.add(sc.nextInt());
		}

		ArrayList<Integer> rev = new ArrayList<>();

		for (int i = 0; i < al.size(); i++) {
			rev.add(al.get(i));
		}
		System.out.println("Print reverse list");
		for (int j = 0; j < rev.size(); j++) {
			System.out.println(rev.get(j) + " ");
		}

	}

}
