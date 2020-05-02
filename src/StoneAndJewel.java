
public class StoneAndJewel {

	public static int numJewelInStones(String s1, String s2) {

		int ans = 0;

		for (char c1 : s1.toCharArray()) {
			for (char c2 : s2.toCharArray()) {

				if (c1 == c2)
					ans++;

			}
		}

		return ans;

	}

	public static void main(String[] args) {

		String j = "Vinay";
		String s = "baloon";

		int p = numJewelInStones(j, s);
		System.out.println(p);

	}

}
