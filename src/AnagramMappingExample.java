import java.util.HashMap;
import java.util.Map;

public class AnagramMappingExample {

	public static int[] anagramMapping(int[] A, int[] B) {

		Map<Integer, Integer> D = new HashMap();

		for (int i = 0; i < B.length; i++) {

			D.put(B[i], i);

		}

		int[] ans = new int[A.length];
		int t = 0;
		for (int x : A) {
			ans[t++] = D.get(x);	
		}
		return ans;
	}

	public static void main(String[] args) {
		int A[] = { 2, 3, 1, 4, 7, 8 };
		int B[] = { 8, 7, 4, 1, 3, 2 };
		int c[] = new int[A.length];

		c = anagramMapping(A, B);

		System.out.println(c);

	}

}
