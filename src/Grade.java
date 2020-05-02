
public class Grade {

	public static void grade(int n) throws BluetalonExeption {

		if (n >= 90 && n <= 100) {
			System.out.println("A");
		} else if (n >= 80 && n <= 90) {
			System.out.println("B");
		} else if (n >= 70 && n <= 60) {
			System.out.println("c");
		} else
			throw new BluetalonExeption("Invalid marks");

	}

	public static void main(String[] args) {

		try {
			grade(101);
		}

		catch (BluetalonExeption e) {
			System.out.println("got an exception check your input");

		}

	}
}