package Collection;

import java.util.ArrayList;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("Akila", 234, 23, "female", 8765765990l, 45000);
		Employee e2 = new Employee("ANU", 244, 25, "female", 8765763450l, 46000);
		Employee e3 = new Employee("RENU", 254, 21, "female", 8765734690l, 47000);
		Employee e4 = new Employee("arun", 236, 26, "male", 9875765990l, 49000);
		ArrayList<Employee> e = new ArrayList<>();
		ArrayList<Employee> newe = new ArrayList<>();
		
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.set(1, e1);
		e.get(3);
		e.remove(e1);
		e.add(1, e2);
		
		int increament = 0;
		for (int i = 0; i < e.size(); i++) {
			int sal = e.get(i).getSalary();

			if (e.get(i).getGender().equalsIgnoreCase("female")) {
				sal = (sal * 10/ 100)+sal;
				e.get(i).setSalary(sal);
				   newe.add(e.get(i));
			}
		}
		     
				newe.forEach(x->System.out.println(x));
		}
}
		
		
		
		
		
		
		
		//for (Employee a : e) {
			// System.out.println(e);
		// e.forEach(a->{
		// if(a.getAge()>=25) {
		// newe.add(a);
		// }
		// });
// System.out.println(newe);

		
		
		
			

		

// e.forEach(c -> { //name toUppercase()
// if (c.getName().equals(c.getName().toUpperCase())) {
// System.out.println(c);
// }
// });



// for (int i = 0; i < e.size(); i++) {//normal loop
// if (e.get(i).getName().length() % 2 == 0) {//name length even
// System.out.println(e.get(i));
// System.out.println(e.get(i));



// for (Employee a : e) {
// System.out.println(e);



// e.forEach(x -> System.out.println(x));



// e.forEach(a -> {
// if (a.getSalary() > 30000) {//more number
// System.out.println(a);
// }
// });



// e.forEach(b -> {
// if (b.getGender()=="male") {//male
// System.out.println(b);
// }
// });
// }
