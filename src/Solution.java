// no of way to reach a nth steps by jumping max 2 steps
public class Solution {

	public static int climbStairs(int n) {
		if (n == 1) {
			return 1;
		}
		int first = 1;
		int second = 2;
		for (int i = 3; i <= n; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}

	public static void main(String[] args) {
		// n=5;
		int p = climbStairs(3);
		System.out.println(p);

	}
}
