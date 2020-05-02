
public class twoSumExample {

	public static int[] twoSum(int a[], int target) {

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] == target - a[i]) {

					return new int[] { i, j };
				}

			}
		}
		throw new IllegalArgumentException("no two sum solution");
	}

	public static void main(String[] args) {

		int a[] = { 2, 3, 4, 1, 5 };
		int target = 6;

		int b[] = twoSum(a, target);

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}
}
