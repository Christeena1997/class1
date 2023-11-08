package Collection;

public class Car {
	private String brand;
	private int price;
	private String color;
	private boolean isPetrol;
	private int year;

	public Car(String brand, int price, String color, boolean isPetrol, int year) {

		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isPetrol = isPetrol;
		this.year = year;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPetrol() {
		return isPetrol;
	}

	public void setPetrol(boolean isPetrol) {
		this.isPetrol = isPetrol;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", color=" + color + ", isPetrol=" + isPetrol + ", year=" + year
				+ "]";
	}

}
