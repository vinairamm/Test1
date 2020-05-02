
public class Find132pattern {

	public static boolean find132pattern(int[] nums) {
		System.out.println(nums.length );

		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[k] > nums[i] && nums[j] > nums[k])
						return true;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int a[] = { 3, 1, 4, 2 };

		boolean n = find132pattern(a);
		System.out.println(n);
	}

}