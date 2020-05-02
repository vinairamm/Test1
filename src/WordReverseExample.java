
public class WordReverseExample {

	public static StringBuffer wordReverse(String input) {
		StringBuffer res = new StringBuffer();
		StringBuffer result = new StringBuffer();

		for (int i = 0; i <= input.length() - 1; i++) {
			
			if(input.charAt(i)!=' ') {

				res.append(input.charAt(i));
			}
			
			if (input.charAt(i) == ' ') {
				result.append(res.charAt(i));
				result.reverse();
			}

			

		}
		return result;
	}

	public static void main(String[] args) {

		String bb = "Life is beautiful";
		StringBuffer output = new StringBuffer();
		output = wordReverse(bb);

		System.out.println(output);

	}

}