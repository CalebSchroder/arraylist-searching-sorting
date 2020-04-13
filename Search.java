import java.util.*;

public class Search {


	public static void main (String[]args) {
		ArrayList <String> haystack = new ArrayList<String>();
		haystack.add("a");
		haystack.add("b");
		haystack.add("c");
		haystack.add("d");
		haystack.add("e");
		haystack.add("f");
		haystack.add("g");
		haystack.add("h");
		haystack.add("i");

		String needle = "f";

		System.out.println(toString(haystack) + "Index of " + needle + " according to binarySearch = " + binarySearch(haystack, needle));
		System.out.println(toString(haystack) + "Index of " + needle + " according to search = " + search(haystack, needle));

	}

	public  static String toString(ArrayList<String> haystack) {
		String thing = "";
		for (int i = 0; i < haystack.size(); i ++) {
			thing = thing + haystack.get(i) + ", ";
		}
		return thing;
	}

	public  static int search(ArrayList<String> haystack,String needle) {
		for (int i = 0; i < haystack.size(); i ++) {
			if (haystack.get(i).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

	public  static int binarySearch(ArrayList<String> haystack, String needle) {
		int increment = 0; 
		for (int i = haystack.size() / 2; i > 0; i = i + increment) {
			increment = 0;
			//System.out.println("increment " + increment);
			//System.out.println("i " + i);
			//System.out.println(haystack.get(i - 1).compareTo(needle));
			if (haystack.get(i - 1).compareTo(needle) == 0) {
				return i - 1;
			} else {
				if (haystack.get(i - 1).compareTo(needle) < 0) {
					increment = (haystack.size() - i) / 2;
					//System.out.println("increment " + increment);
				} else {
					increment = (i - haystack.size()) / 2;
					//System.out.println("increment " + increment);
				}
			}
		}
		return -1;
	}
} 