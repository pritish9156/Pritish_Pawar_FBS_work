package problem_3;

public class CafeteriaApplication {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Sham sunder", 10000);
		Employee e2 = new Employee(102, "Ganesh Ji", 20000);
		Employee e3 = new Employee(103, "Raghav Kumar", 20000);
		
		Cafeteria c1 = new Cafeteria(1, e1);
		Cafeteria c2 = new Cafeteria(2, e3);
		
		CafeteriaService os = new CafeteriaService();
		
		os.order(c1);
		os.order(c2);
		
		os.serveOrder();
		os.serveOrder();

	}

}
