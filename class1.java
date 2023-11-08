package Collection;

import java.util.ArrayList;
//add() method
public class class1 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(100);
		nums.add(200);
		nums.add(300);
		nums.add(400);
		nums.add(1, 150);
		System.out.println(nums);
	}

}
