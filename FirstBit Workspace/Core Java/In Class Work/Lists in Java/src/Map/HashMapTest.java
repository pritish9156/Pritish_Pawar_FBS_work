package Map;

import java.util.Collections;
import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<MyKey, Employee> h1 = new HashMap<MyKey, Employee>();
		
		h1.put(new MyKey(1), new Employee(1, "Rohan", 10000));
		h1.put(new MyKey(2), new Employee(2, "Rohan", 10000));
		h1.put(new MyKey(3), new Employee(4, "Rohan", 10000));
		h1.put(new MyKey(3), new Employee(4, "Rohan", 10000));
		
		System.out.println(h1);


	}

}
