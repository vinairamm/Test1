
public class SubstringExample {
	public static void main(String[] args) {

		String s = "abcabcbb";
		StringBuffer sb = new StringBuffer();
		
		System.out.println(s.length() - 1);

		for (int i = 0; i < s.length() - 1 && i < sb.length() - 1; i++) {

			sb.append(s.charAt(i));
			if (sb.charAt(i) == s.charAt(i)) {

				sb.deleteCharAt(i);

			}

		}

		String fin = sb.toString();

		System.out.println(fin);

	}

}
