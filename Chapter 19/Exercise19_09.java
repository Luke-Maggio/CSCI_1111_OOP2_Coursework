package exercise19_09;

import java.util.ArrayList;

public class Exercise19_09 {
	  public static void main(String[] args) {
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    list.add(14);
		    list.add(24);
		    list.add(4);
		    list.add(42);
		    list.add(5);
		    Exercise19_09.<Integer>sort(list);
		    
		    System.out.print(list);
	  }
	  
	  public static <E extends Comparable<E>> void sort(ArrayList<E> list) { 
		E MinIndex;
		for (int i = 0; i < list.size(); i++) {
		for (int j = 0; j < list.size() - 1; j++) {
			if (list.get(j).compareTo(list.get(j + 1)) > 0) {
				MinIndex = list.get(j);
				list.set(j, list.get(j + 1));
				list.set(j + 1, MinIndex);
				}
			}
		}
	  }
}
