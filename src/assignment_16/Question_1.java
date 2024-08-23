/*
1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to 
ArrayList and perform the below operations
Add an element to the ArrayList
Iterate through the ArrayList by using Iterator object
Add an element at a specific index
Remove an element from the ArrayList, Remove at an index
Update the element at a specific index
Check the element is present at a particular index
Get an element at a particular index
Find out the size of the ArrayList
Check the given element is present in the ArrayList
Remove all elements of the ArrayList
*/
package assignment_16;

import java.util.ArrayList;
import java.util.Iterator;

public class Question_1 {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al = new ArrayList<>();
		al.add("apple");
		al.add("banana");
		al.add("Cherry");
		al.add("Grape");
		al.add("Coconut");
		al.add("Carambola");
		al.add("Cantaloupe");
		al.add("Blackberry");
		al.add("Avocado");
		al.add("Apricot");

		Iterator<String> iterator = al.iterator();
		while (iterator.hasNext()) {
			String fruits = (String) iterator.next();
			System.out.println(fruits);
		}

		al.add(4, "mango");
		System.out.println(al);
		al.remove(6);
		System.out.println(al);

		al.set(6, "water melon");
		System.out.println(al);
		int index = 5;
		if (index >= 0 && index < al.size()) {
			System.out.println("element is present at " + index + " index.");
		} else {
			System.out.println("element is not present at " + index + " index");
		}

		System.out.println(al.get(3));
		System.out.println(al.size());
		String fruit = "mango";
		for (String f : al) {
			if(fruit.equals(f)) {
				System.out.println(fruit+" is present in the ArrayList");
			}
		}
		al.clear();
		System.out.println(al);

	}

}
