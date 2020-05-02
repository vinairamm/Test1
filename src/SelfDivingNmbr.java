import java.awt.List;
import java.util.ArrayList;

public class SelfDivingNmbr {

	public ArrayList<Integer> SelfDiving(int left, int right) {

		 ArrayList<Integer> ans = new ArrayList();

		for (int n = left; n <= right; n++) {
			
			if(selfDividing(n))ans.add(n);

		}
	
		return ans;

}

	public static boolean selfDividing(int n) {

		for (char c : String.valueOf(n).toCharArray()) {
			if (c == '0' || (n % (c - '0') > 0)) {

				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		boolean n = selfDividing(128);
		System.out.println(n);

	}
}