
public class SubstringExamplee {

	static StringBuffer sb = new StringBuffer();

	public static boolean repeatedSubstringPattern(String s) {

		for (int i = 0; i < s.length() -1; i++) {

			sb.append(s.charAt(i));

			if (sb.substring(0, i) == sb.substring(i + 1, i + i)) {

				sb.delete(i + 1, i + i);

			}

		}
		return false;

	}

	public static void main(String[] args) {
		boolean n;
		String s1 = "abcabc";
		n= repeatedSubstringPattern(s1);
		System.out.println(n);
	}
}
