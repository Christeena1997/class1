package Collection;

import java.util.HashMap;

public class Useclasshashmap {

	public static void main(String[] args) {
		Car c1 = new Car("xxxa", 5700, "red", false, 2016);
		Car c2 = new Car("yyyy", 5000, "yellow", false, 2019);
		Car c3 = new Car("zzzze", 5800, "green", true, 2018);
		Car c4 = new Car("yttt", 6800, "blue", false, 2015);
		Car c5 = new Car("sou", 8000, "pink", true, 2014);
		HashMap<Integer, Car> car = new HashMap<>();
		HashMap<Integer, Car> newe = new HashMap<>();
		car.put(c1.getPrice(), c1);
		car.put(c2.getPrice(), c2);
		car.put(c3.getPrice(), c3);
		car.put(c4.getPrice(), c4);
		car.put(c5.getPrice(), c5);

		// keySet() enchance loop
//		for(Integer m:car.keySet()) {
//			System.out.println(m);
//		}

		// values() enchance loop
//car.values().forEach(y->System.out.println(y));

		// keyset foreach condition
//		car.keySet().forEach(y->{
//			if(car.get(y).getColor().equals("red")){
//				
//              System.out.println(car.get(y));
//		
		for (Integer f : car.keySet()) {
			if (car.get(f).getBrand().contains("a") || car.get(f).getBrand().contains("e")
					|| car.get(f).getBrand().contains("i") || car.get(f).getBrand().contains("o")) {
				newe.put(f, car.get(f));
			}
			System.out.println(newe);
		}
	}

}
