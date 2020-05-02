import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {

		Set<String> kk = new HashSet<String>();
		kk.add("Geeks");
		kk.add("for");
		kk.add("Example");
		kk.add("Set");

		System.out.println("set output without the duplicates");

		System.out.println(kk);

		System.out.println("Sorted set after passing treeset");

	    Set<String> pp = new TreeSet<String>(kk);
		System.out.println(pp);

	}

}
