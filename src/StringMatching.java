import java.util.HashSet;
import java.util.Set;

public class StringMatching {

	public static int numJewelInStone(String J, String S) {

		Set<Character> Jset = new HashSet();

		for (char j : J.toCharArray())

			Jset.add(j);
		int ans = 0;

		for (char s : S.toCharArray())
			if (Jset.contains(s))
				ans++;
		return ans;

	}

	public static void main(String[] args) {

		String J = "aa";
		String S = "aaaA";

		int n = numJewelInStone(J, S);

		System.out.println(n);

	}
}
