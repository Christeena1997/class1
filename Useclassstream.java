package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Useclassstream {

	public static void main(String[] args) {
		Car c1 = new Car("xxxa", 5700, "red", false, 2016);
		Car c2 = new Car("yyyy", 5000, "yellow", false, 2019);
		Car c3 = new Car("zzzze", 5800, "green", true, 2018);
		Car c4 = new Car("yttt", 6800, "blue", false, 2015);
		Car c5 = new Car("sou", 8000, "pink", true, 2014);
		ArrayList<Car> car = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5));
//	car.stream().filter(x->x.getBrand()=="xxxa").forEach(y->System.out.println(y));
	//car.stream().filter(x->x.getColor()=="yellow").collect(Collectors.toList()).forEach(y->System.out.println(y));
//	Car m=car.stream().min(Comparator.comparingInt(Car::getYear)).get();
//	System.out.println(m);
//	car.stream().filter(x->x.getBrand()=="yttt").sorted().forEach(y->System.out.println(y));
//		car.stream().filter(x->x.getBrand()=="yttt").limit(2).forEach(y->System.out.println(y));
	}
}
//filter() and stream()
//----------------------------------------------------------------------------------------------
// car.stream().filter(x->x.getPrice()>6800).forEach(y->System.out.println(y));
//-----------------------------------------------------------------------------------------------
// filter and map()
// car.stream().filter(x->x.getPrice()>=5000).map(y->y.getBrand()).forEach(z->System.out.println(z));
//---------------------------------------------------------------------------------------------------------
// filter() and collect()
// car.stream().filter(x->x.getPrice()>5700).collect(Collectors.toList()).forEach(z->System.out.println(z));
//-----------------------------------------------------------------------------------------------------------
// filter() and count()
//	Car l=	car.stream().max(Comparator.comparingInt(Car::getPrice)).get();
//		System.out.println(l);
//	}
