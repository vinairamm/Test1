
public class SolutionExample {

	public static char nextGreatestletter(char[] letters, char target) {

		for (char c : letters) {
			if (c > target)
				return c;

		}
		return letters[0];
		

	}
	public static void main(String[] args) {
		char a[]= {'z', 'f', 'j'};
		char target='v';
		
	char c=	nextGreatestletter(a,target);
	
	System.out.println(c);
	
	
		
	}

}
