
public class ClimbingStairss {

	public static int findSteps(int n) {

		if (n == 0 || n == 1) {

			return 1;
		} else if (n == 2) {

			return 2;
		} else {

			return findSteps(n - 1) + findSteps(n - 2);
		}
	}

	public static void main(String[] args) {

		int k = findSteps(5);
		System.out.println(k);
	}

}
