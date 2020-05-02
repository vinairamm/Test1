
public class SubsetExam {

	public static void printSubsets(char set[]) {
		int n = set.length;

		for (int i = 0; i < (1 << n); i++) {

			System.out.print("{");

			for (int j = 0; j < n; j++) {

				if ((i & (1 << j)) > 0)
					System.out.println(set[j] + " ");
				System.out.print("} ");

			}

		}
	}
		
		public static void main(String[] args) 
		{
			
			char set1[]= {'a','b','c'};
			printSubsets(set1);
		}
	

}
