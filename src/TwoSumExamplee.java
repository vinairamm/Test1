import java.util.HashMap;
import java.util.Map;

public class TwoSumExamplee {

	public static int[] twosum(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int complement = target - nums[i];

			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };

			}
			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("No two sum solutions");
	}

	public static void main(String[] args) {

		int a[] = { 3, 2, 1, 5, 6 };
		int target = 9;

		int c[] = twosum(a, target);

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
