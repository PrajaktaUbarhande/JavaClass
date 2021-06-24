package arrayPrograms;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		int[] a = { 1,1,2,2,3,3,3,4,5,6,6};
		
		int j =0 ;
		for(int i =0 ;i<a.length-1;i++) {
			
		    if (a[i] != a[i+1]) {

		    	a[j]=a[i];
		    	j++ ;
		    	
			}
		    
		    a[j]=a[a.length-1];
		    for(int i1 =0;i1<j+1;i1++) {
		    	System.out.print(a[i]+ " ");
		    }
			
			
		}
		
		

	}

}
