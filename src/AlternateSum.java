
public class AlternateSum {

	public static void Moneysum(int a[]) {

		int sum = 0;
		int sum1 = 0;

		for (int i = 0; i < a.length; i = i++) {
			if (i % 2 == 0) {

				sum = sum + a[i];
				System.out.println(sum);

			}

			else if (i % 2 == 1) {
				sum1 = sum1 + a[i];

			}
			System.out.println(sum1);

		}

	}

	public static void main(String[] args) {
		int s[] = { 12, 1, 4, 5, 6, 7, 8, 9, 33, 5 };

		Moneysum(s);

	}
}
