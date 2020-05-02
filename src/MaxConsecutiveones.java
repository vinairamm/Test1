
public class MaxConsecutiveones {

	public static int Maxcount1s(int[] nums) {
		int i = 0;
		int count = 0;
		while (i <= nums.length-1) {

			if (nums[i] == 1 && nums[i + 1] == 1) {
				count++;
				i++;
			} else {
				i++;
			}

		}

		return count;

	}

	public static void main(String[] args) {

		int[] p = { 1, 1, 1, 1, 1, 0, 1, 0 };
		int c = Maxcount1s(p);
		System.out.println(c);
	}

}
