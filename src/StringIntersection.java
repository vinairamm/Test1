
public class StringIntersection {

	public static void intersection(int[] nums1, int[] num2) {
		// int [] n= new int[nums1.length + num2.length];

		for (int i = 0; i < nums1.length; i++) {

			for (int j = 0; j < num2.length; j++) {

				if (nums1[i] == num2[j]) {

					System.out.println(nums1[i]);
				}
			}
		}

	}

	public static void main(String[] args) {

		int a[] = { 2, 1, 4, 3 };
		int b[] = { 2, 2, 1 };
		int[] c = new int[a.length + b.length];

		intersection(a, b);

	}

}
