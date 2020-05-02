
public class ClimbingStairs {

	public static void main(String[] args) {

		int n = 5;
		if (n == 1) {
			System.out.println("1");
		}

		int[] pp = new int[n + 1];
		pp[1] = 1;
		pp[2] = 2;

		for (int i = 3; i <= n; i++) {
			pp[i] = pp[i - 1] + pp[i - 2];
		}
		System.out.println(pp[n]);

	}

}
