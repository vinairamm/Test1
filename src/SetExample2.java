import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetExample2 {

	public static void main(String[] args) {

		Set<Integer> a = new HashSet<Integer>();
a.addAll(Arrays.asList(new Integer[] {1,3,5,1,123,31,9}));
a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));

		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));
		int []c={1,2,4,6,1,8,12};
		
	

		// union
		Set<Integer> union = new HashSet<Integer>(a);

		union.addAll(b);
		System.out.println("Union of 2 sets");
		System.out.println(union);

		// intersection

		Set<Integer> Intersect = new HashSet<Integer>(a);

		Intersect.retainAll(b);
		System.out.println("Intersection of 2sets");
		System.out.println(Intersect);

		// symmetric difference
		Set<Integer> difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.println("Difference of 2 set");
		System.out.println(difference);
	}

}
