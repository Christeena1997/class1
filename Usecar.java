package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Usecar {

	public static void main(String[] args) {
		Car c1=new Car("HONDA", 5700, "red", false, 2016);
		Car c2=new Car("Maruthi", 5000, "yellow", false, 2019);
		Car c3=new Car("suzuki", 5000, "green", true, 2018);
		Car c4=new Car("Nano", 6800, "blue", false, 2015);
		Car c5=new Car("swift", 8000, "pink", true, 2014);
		ArrayList<Car>car=new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5));
		ArrayList<Car>newe=new ArrayList<>();
//		for(int i=0;i<car.size();i++) {
//		
//			if(car.get(i).getBrand().equals(car.get(i).getBrand().toUpperCase())&&(car.get(i).getPrice()>5600)) {
//			System.out.println(car.get(i));
//		}
//		car.forEach(x->{
//			
//		if(x.getPrice()==5000) {
//			System.out.println(x);
//		}
//		});
		
		///new array add   normal for
//		for(int i=0;i<car.size();i++) {
//			if(car.get(i).getYear()==2015) {
//				newe.add(car.get(i));
//			}
//			
//			}
//		System.out.println(newe);
		
		
		//normal enhance loop new array add
//		for(Car b:car) {
//			if(b.getYear()==2016) {
//				newe.add(b);
//			}
//		}
//		System.out.println(newe);
		
		//for each new array add
//		car.forEach(y->{
//			if(y.getYear()==2014) {
//				newe.add(y);
//			}
//		});
//		System.out.println(newe);
//	}
//		for(int i=0;i<car.size();i++) {
////			System.out.println(car.get(i));
//	newe.add(car.get(i));
//		
//		}
//		System.out.println(newe);
		car.forEach(x->{
			if(x.getBrand()=="HONDA") {
//				System.out.println(x);
			newe.add(x);
			}
		});
		System.out.println(newe);
		
		
		
}
}
		
