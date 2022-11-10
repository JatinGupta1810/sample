import java.util.Comparator;
import java.util.Map;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.HashMap;

class Employee implements Comparable<Object> {

	int emp_id;
	String emp_name;

	public Employee(int id, String name) {
		emp_id = id;
		emp_name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Id is :" + this.emp_id + ", Name is :" + this.emp_name + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		int i1 = emp.emp_id;
		int i2 = this.emp_id;
		if (i1 == i2)
			return 1;
		else
			return i2 - i1;
	}
}

public class Main {

	static public void main(String[] args) {

//		TreeSet t = new TreeSet<>();
//		t.add("z");
//		t.add("a");
//		t.add("A");
//		t.add("Z");
//		t.add("C");
//		System.out.println(t);//[A, C, Z, a, z]

//		TreeSet t1 = new TreeSet<>((Comparator<String>) (o1, o2) -> {
//			if (String.valueOf(o1.charAt(1)).compareTo(String.valueOf(o2.charAt(1))) == 0)
//				return 1;
//			else
//				return String.valueOf(o1.charAt(1)).compareTo(String.valueOf(o2.charAt(1)));
//		});
//		t1.add("Jatin");
//		t1.add("Divyansh");
//		t1.add("Jai");
//		t1.add("Gauransh");
//		t1.add("Khooshal");
//		System.out.println(t1);

//		TreeSet t2 = new TreeSet<>();
//
//		t2.add(new Employee(3, "Jatin"));
//		t2.add(new Employee(2, "Jai"));
//		t2.add(new Employee(15, "Gauransh"));
//		t2.add(new Employee(7, "Divyansh"));
//		t2.add(new Employee(7, "Khooshal"));
//
//		System.out.println(t2);

//		TreeSet t3 = new TreeSet<>(new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				if (o1.emp_name.length() == o2.emp_name.length())
//					return o1.emp_name.compareTo(o2.emp_name);
//				else
//					return o1.emp_name.length() - o2.emp_name.length();
//			}
//		});
//
//		t3.add(new Employee(3, "Jatin"));
//		t3.add(new Employee(2, "Jai"));
//		t3.add(new Employee(15, "Khooshal"));
//		t3.add(new Employee(7, "Divyansh"));
//		t3.add(new Employee(7, "Gauransh"));
//
//		System.out.println(t3);

		// You can use heterogenous if you create your own comparator

//		TreeSet t4 = new TreeSet(new Comparator<Object>() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				String s1 = o1.toString();
//				String s2 = o2.toString();
//				return s1.compareTo(s2);
//			}
//		}.reversed());
//
//		t4.add("Jatin");
//		t4.add("Khooshal");
//		t4.add(new StringBuilder("Yogesh"));
//		t4.add(new StringBuilder("Jai"));
//		t4.add(45);
//		t4.add(45.89);
//		t4.add(new Employee(23, "Kuldeep"));
//		System.out.println(t4);

	}
}
