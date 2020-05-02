package test;

public class Solution {

	 public static int indexEqualsValueSearch(int[] arr) {
		
			
			for(int i=0;i<arr.length;i++) {
			
		      if(arr[i]==i){
		       return i;
		      }
			}
		    	  
		    return -1;
		    
		  }
	 public static int binarysearch(int arr[],int low, int high) {
		 
		 if(high >= low) {
			 
			int mid = low +(high-low)/2;
			 if(mid==arr[mid])
				 return mid;
			 
		 if(mid>arr[mid]) {
			 return binarysearch(arr, (mid+1), high);
		 }
		 else 
			 return binarysearch(arr, low, (mid-1));
	 }
	 
	 return -1;
	 }
		  public static void main(String[] args) {
		    int[] arr={-8,0,2,5};
		        int p = binarysearch(arr, 0, arr.length-1);
		        
		        
		      System.out.println(p);

		  }

	}

