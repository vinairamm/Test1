
public class Maxsubarrayy {

	public static void main(String[] args) {
		int a[] = {-3,0,1, 1, 5, 3 };

		System.out.println("Maximum contigious sum is" + arraysum(a));
	}

	static int arraysum(int a[]) {

		int size = a.length;
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;

		for (int i = 0; i < size; i++) {

			max_ending_here = max_ending_here + a[i];

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}

			if (max_ending_here < 0) {
				max_ending_here = 0;
			}
		}

		return max_so_far;

	}

}
