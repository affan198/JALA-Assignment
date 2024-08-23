/*
2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
Insert a Key value mapping into the map
Fetch the value of a Key
Create a clone/copy of HashMap
Check if the given Key is in the Map
Check if the value is in the Map
Check if the map is empty
Print the size of the Map to the console
Print all the Keys of the map to the console
Print all the Keys of the map to the console
Remove a specific Key-value pair
Copy all the elements of the Map to another Map
*/
package assignment_16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Question_2 {

	public static void main(String[] args) {

		HashMap<Integer, String> hp = new HashMap<Integer, String>();
		hp.put(101, "Affan");
		hp.put(102, "Atif");
		hp.put(103, "Arsalan");
		hp.put(104, "Osama");
		hp.put(105, "Muzzammil");
		hp.put(106, "Chand");
		hp.put(107, "Salman");
		hp.put(108, "Amir");
		hp.put(109, "Ahesan");
		hp.put(110, "Sarin");
		System.out.println(hp);
		System.out.println(hp.get(103));

		// using clone() method
		HashMap<Integer, String> hp1 = (HashMap<Integer, String>) hp.clone();
		System.out.println(hp1 == hp);

		// using copy constructor
		HashMap<Integer, String> hp2 = new HashMap<Integer, String>(hp1);
		System.out.println(hp1 == hp2);

		// using put all method
		HashMap<Integer, String> hp3 = new HashMap<Integer, String>();
		hp3.putAll(hp);
		System.out.println(hp3 == hp);

		HashMap<Integer, String> hp4 = hp;
		System.out.println(hp4 == hp);
		System.out.println(hp.containsKey(106) ? "kye is present" : "kye is not present");
		System.out.println(hp.containsValue("Affan") ? "value is present" : "value is not present");
		System.out.println("is HashMap empty : " + hp.isEmpty());
		System.out.println("size of the map is : " + hp.size());

		for (Map.Entry<Integer, String> entry : hp.entrySet()) {

			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		Iterator<Entry<Integer, String>> iterator = hp.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<java.lang.Integer, java.lang.String> entry = (Map.Entry<java.lang.Integer, java.lang.String>) iterator
					.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}
		Iterator<Integer> iterator2 = hp.keySet().iterator();
		while (iterator2.hasNext()) {
			Integer integer = (Integer) iterator2.next();
			System.out.println(integer);

		}
		hp.forEach((key, value) -> {
			System.out.println(key);
			System.out.println(value);
		});
		
		hp.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		});
		
		System.out.println(hp.remove(108, "Amir"));
		System.out.println(hp);
		System.out.println(hp1);
		System.out.println(hp2);
		System.out.println(hp3);
		System.out.println(hp4);
		
	}

}
