package oldway;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Employee
{
	public int id;
	public String name;
}
public class Main {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,34,43,43,45,4,4,4,45,45,542,3,4);
		
		Stream<Integer> res = list.stream().filter(x->x%2==0);
		res.forEach(x->System.out.println(x));

}
}