
public class ZerosMove {
	public static int[] ZeroMove(int arr[], int n) 	{
	int count=0;
	for(int i=0;i<n;i++) {
		
		if(arr[i]!=0) {
			arr[count++]=arr[i];
		}
	}
		while(count<n) {
			arr[count++]=0;
		}
		
	
	return arr;
	
	
	}
	public static void main(String[] args) {
		int b[] = { 0, 1, 0, 3, 12 };
		int n = b.length;
		int c[] = ZeroMove(b, n);
		for (int i = 0; i < n; i++) {
			System.out.println(c[i]);
		}
	}

}
