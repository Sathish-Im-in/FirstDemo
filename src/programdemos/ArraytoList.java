package programdemos;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraytoList {
	
	public static void main(String[] args) {
	
//	Integer[] integers = new Integer[] { 1, 2, 3, 4, 5 };
//	
//	List<Integer> list1 = new ArrayList<>(Arrays.asList(integers)); 
//	 	
//	System.out.println(list1);

	int a[] = {1, 2, 3, 4, 5};
	
	for (int i = 0; i < a.length; i++) {
		
		System.out.print(a[i] +" ");
	}
	
	System.out.println();
	
	List<Integer> list = new ArrayList<>();
	
	for (int i = 0; i < a.length; i++) {
	
	list.add(a[i]);
	
	}
	System.out.println(list);

	Set<Integer> treeSet = new TreeSet<>();

	for (int i = 0; i < a.length; i++) {
		
		treeSet.add(a[i]);
	}
	System.out.println(treeSet);
	}
}

