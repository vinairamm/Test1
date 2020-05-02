import java.util.HashMap;
import java.util.Map;

public class AnagramMappingLeetcode {

	public static int[] anagramMappings(int[] A, int[] B) {
		HashMap<Integer, Integer> hh = new HashMap<Integer, Integer>();

		for (int i = 0; i < B.length; i++) {
			hh.put(B[i], i);
		}
		int result[] = new int[A.length];
		int t = 0;

		for (int x : A) {
			result[t++] = hh.get(x);
		}
		return result;

	}

	public static void main(String[] args) {
		int c[] = { 12, 28, 46, 32, 50 };
		int D[] = { 50, 12, 32, 46, 28 };

		int[] E = new int[c.length];
		E = anagramMappings(c, D);

		for (int i = 0; i < E.length; i++) {
			System.out.println(E[i]);
		}

	}

}
