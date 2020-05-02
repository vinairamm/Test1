import java.util.Scanner;

public class Base7Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println("Enter the base you would like to convert the number to:");

		int b = sc.nextInt();
		int q = n, r;
		String ans = "";
		while (q != 0) {
			r = q % b;
			ans = r + ans;
			q = q / b;
		}
		System.out.println(ans);
	}

}
