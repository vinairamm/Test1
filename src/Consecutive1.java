
public class Consecutive1 {

	public static int ConSecutivenums(int[] nums) {

		int currentcount = 0, maxcount = -1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				if (maxcount < currentcount) {

					maxcount = currentcount;

				}
				currentcount = 0;
			} else {
				currentcount++;
			}

		}
		return Math.min(maxcount, currentcount);
	}

	public static void main(String[] args) {

		int a[] = { 1, 0, 0, 1, 1, 1, 0, 0 };
		int c = ConSecutivenums(a);

		System.out.println(c);

	}

}
