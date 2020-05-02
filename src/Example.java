
public class Example {

	public static boolean isPower(int n) {

	if(n<1) {
		return false;
	}
	while(n%3==0) {
		n/=3;
	}
	return true;
	
	}
		public	static void main(String[] args) {
		boolean s=isPower(9);
		System.out.println(s);
	}
}
