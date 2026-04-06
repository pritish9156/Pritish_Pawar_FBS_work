package Map;

import java.util.TreeMap;

public class TreeMapTest {
	
	public static void main(String[] args) {
		
		TreeMap<MyKey, Employee> h1 = new TreeMap<MyKey, Employee>();
		
		h1.put(new MyKey(1), new Employee(1, "Rohan", 10000));
		h1.put(new MyKey(2), new Employee(2, "Rohan", 10000));
		h1.put(new MyKey(3), new Employee(4, "Rohan", 10000));
		h1.put(new MyKey(4), new Employee(4, "Rohan", 10000));
		
		System.out.println(h1);
	}

}
