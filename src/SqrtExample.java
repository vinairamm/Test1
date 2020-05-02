
public class SqrtExample {

	static int Sqrt(int n) {

		if (n == 0 || n == 1)
			return n;

		int i = 1, output = 1;

		while (output <= n) {
			
			i++;
			output = i * i;
		}

		return i - 1;
	}

	public static void main(String[] args) {
		int n = 16;
		System.out.print(Sqrt(n));
	}
}