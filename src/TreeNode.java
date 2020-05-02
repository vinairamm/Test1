
public class TreeNode {

	public char nextGreatestLetter(char[] letters, char target) {

		boolean[] seen = new boolean[26];

		for (char c : letters) {
			seen[c - 'a'] = true;

		}

		while (true) {
			target++;
			if (target > 'z')
				target = 'a';
			if (seen[target - 'a'])
				return target;
		}

	}
	
	public static void main(String[] args) {
		
		letters [] a= {"c","f","j"};
		
		target="d";
		
		char c= nextGreatestLetter(c, target );
		
	}

}
