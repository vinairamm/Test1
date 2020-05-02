
public class LargestSumArray {

	public static void main(String[] args) {
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

		System.out.println("Maxmum contiguous sum is" + maxSubArraySum(a));
	}
	
	public static maxSubArraySum(int a[]) {
		
		int size=a.length;
		int max_so_far=Integer.MIN_VALUE, max_ending_here=0;
		
		for(int i=0;i<size;i++) {
			
			max_ending_here=max_ending_here+a[i];
			if(max_ending_here<0)
				max_ending_here=0;
			
			else if(max_so_far<max_ending_here)
				max_so_far=max_ending_here;
			}
		return max_so_far;
	}
}
