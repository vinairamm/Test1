
public class ArrayTarger {
	
	public static int ArrayInteger(int b) {
		
		int temp=null;
		
		int a[]= {1,3,5,6};
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==b) {
				System.out.println("i");
			}
			else if(a[i]!=b) {
				
				if(a[i]>b) {
					temp=b;
					b=a[i];
					a[i]=temp;
				}
				else 
					i++;
					
				
			}
		}
	}

}
