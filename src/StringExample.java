
public class StringExample {

	static String s2 = new String();

	public static String ReverseString(String s) {

		StringBuffer sb = new StringBuffer();
		sb.append(s);
		sb.reverse();

		s2 = sb.toString();
		return s2;

	}

	public static void main(String[] args) {

		String s1 = "Vinay";

		String s3 = ReverseString(s1);
		System.out.println(s3);

	}
}
