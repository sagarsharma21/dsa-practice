/**
 * 
 */
package practicearraylist;

/**
 * 
 */
import java.util.ArrayList;

public class pr1 {

	// Creating ArrayList Using Generics
	// Description
	// Complete the code below to create an ArrayList named ‘random’,
	// using Generics, with five elements — 2, 4, 5, 10, and 99.9
	// — stored as float-type values in ArrayList, and then,
	// print this ArrayList using the printList method.
	//
	public static void main(String[] args) {
		ArrayList<Float> random = new ArrayList<Float>();
		random.add((float) 2);
		random.add((float) 4);
		random.add((float) 5);
		random.add((float) 10);
		random.add(33.3f);

		// printList(random);
		printForeach(random);
		// System.out.println(random.get(i));
	}

	static void printList(ArrayList al) {
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

	public static void printForeach(ArrayList<Float> al) {
		for (Float item : al) {
			System.out.println(item);
		}
	}

}
