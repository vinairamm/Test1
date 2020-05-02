
public class RomanToInteger {

	public static int value(char a) {
		if (a == 'I')
			return 1;
		if (a == 'V')
			return 5;
		if (a == 'c')
			return 100;
		if (a == 'L')
			return 50;
		if (a == 'M')
			return 1000;
		if (a == 'D')
			return 500;
		if (a == 'X')
			return 10;
		return -1;

	}

	public static int romanToDeciman(String str) {
		int res = 0;

		for (int i = 0; i < str.length(); i++) {
			int s1 = value(str.charAt(i));

			if (i + 1 < str.length()) {
				int s2 = value(str.charAt(i + 1));

				if (s1 >= s2) {
					res = res + s1;
				}

				else {
					res = res + s2 - s1;
					i++;
				}
			}
		}

		return res;

	}

	public static void main(String[] args) {
		// String p = "MCMIV";
		// int n = romanToDeciman(p);
		// System.out.println(n);
		RomanToInteger ob = new RomanToInteger();
		String str = "MCMIV";
		System.out.println("Integer form of Roman Numeral" + " is " + ob.romanToDeciman(str));
	}

}