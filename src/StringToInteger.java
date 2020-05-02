
public class StringToInteger  {

	public int Conversion(String s)  {

		int result = Integer.parseInt(s);

		return result;
	}

	public static void main(String[] args) {

		String s = "45";

		StringToInteger n1 = new StringToInteger();

		int n = n1.Conversion(s);

		System.out.println(n);
	}

}
