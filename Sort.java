import java.util.*;

public class Sort {
    

	
	public static void main (String[]args) {
		ArrayList <String> list = new ArrayList<String>();
		list.add("b");
		list.add("a");
		list.add("d");
		list.add("g");
		list.add("c");
		list.add("e");
		list.add("h");
		list.add("f");

		insertionSort(list);
		System.out.println(toString(list));
	}

	public static String toString(ArrayList<String> list) {
		String thing = "";
		for (int i = 0; i < list.size(); i ++) {
			thing = thing + list.get(i) + ", ";
		}
		return thing;

	}

	public static void selectionSort(ArrayList<String> list) {
		String hold = "";
		int smallest;
		for(int k = 0; k < list.size(); k ++) {
			smallest = k;
			//System.out.println("before" + smallest);
			for (int i = k; i < list.size(); i ++) {
				if (list.get(i).compareTo("a") < list.get(smallest).compareTo("a")) {
					smallest = i;
					//System.out.println("after" + smallest);
				}
			}
			hold = list.get(k);
			list.set(k,list.get(smallest));
			list.set(smallest,hold);
		}

	}
	//couldnt get this perfectly working, got really close but I have no clue what is wrong with it at this point
	public static void insertionSort(ArrayList<String> list) {
		String hold = ""; 
		int j = 0;
		for(int i = 1; i < list.size(); i ++) {
			j = i;
			for (int k = i - 1; k >= 0; k --) {
				System.out.println("i b" + i);
				System.out.println("k b" + k);
				if (list.get(j).compareTo("a") <= list.get(k).compareTo("a")) {
					System.out.println("i a" + i);
					hold = list.get(j);
					list.set(j,list.get(k));
					list.set(j,hold);
				}
				j  = j - 1;
			}
		}
	}

	//had to use 2 slightly different for loops on bubbleSort. I didnt see any other way to essentailly do the odd then the even pairs.
	public  static void bubbleSort(ArrayList<String> list) {
		String hold = "";
		boolean epic = true;
		while(epic) {
			epic = false;
			for (int i = 0; i < list.size() - 1; i ++){
				if (list.get(i + 1).compareTo("a") <= list.get(i).compareTo("a")) {
					hold = list.get(i);
					list.set(i,list.get(i + 1));
					list.set(i + 1,hold);
					epic = true;
				}
			}
			for (int i = 1; i < list.size() - 1; i ++){
				if (list.get(i + 1).compareTo("a") <= list.get(i).compareTo("a")) {
					hold = list.get(i);
					list.set(i,list.get(i + 1));
					list.set(i + 1,hold);
					epic = true;
				}
			}
		}
	}
}