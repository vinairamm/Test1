
public class BinaryExample {

	public static String addBinary(String a, String b) {

		int firstIndex = a.length() - 1, secondIndex = b.length() - 1, reminder = 0, digit = 0;

		StringBuilder result = new StringBuilder();

		while (firstIndex >= 0 || secondIndex >= 0) {
			digit = 0;
			if (firstIndex >= 0) {
				digit = a.charAt(firstIndex--) - '0';

			}
			digit = digit + reminder;
			reminder = digit / 2;
			result.append(digit % 2);
		}
		if (reminder == 1) {
			result.append(reminder);
		}
		return result.reverse().toString();

	}

	public static void main(String[] args) {
		String a = "11";
		String b = "1";

		String output = addBinary(a, b);
		System.out.println(output);
	}

}
