import java.util.HashSet;

public class MorseCodeSolution {

	public static int uniqueMorse(String[] words) {

		String[] Morse = new String[] { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
				".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
				"--.." };
		HashSet seen = new HashSet();

		for (String word : words) {

			System.out.println(word);

			StringBuilder code = new StringBuilder();

			for (char c : word.toCharArray()) {
				
				code.append(Morse[c - 'a']);
				
				System.out.println(code);
				
				seen.add(code.toString());
				//System.out.println(seen);
				
			}
		}
		return seen.size();
	}

	public static void main(String[] args) {
		String s[] = { "gin", "zen", "gig", "msg" };

		int n = uniqueMorse(s);

		System.out.println(n);

	}

}
