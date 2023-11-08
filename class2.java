package Collection;

import java.util.ArrayList;

public class class2 {
//set
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(500);
		nums.add(700);
		nums.add(790);
		nums.set(2, 600);
		System.out.println(nums.set(1, 300));
	}

}
