
public class PerfecctSqre {

	public static int sqrt(int n) {

		if (n == 1 || n == 0)

			return n;

		int i = 1;
		int j = 1;

		while (i <= n) {

			i++;
			n = i * i;

		}

		return i - 1;
	}

	public static void main(String[] args) {

		int p = sqrt(13);
		System.out.println(p);

	}

}
