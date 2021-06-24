package arrayPrograms;

import java.util.HashSet;

public class ArrayRemoveUsingHashMap {

	public static void main(String[] args) {
		
		int[] a = { 7,1,1,2,2,3,3,3,2,4,5,6,6};
		
		HashSet<Integer> hs= new HashSet<>();
		for(int i =0 ;i<a.length;i++) {
			
			hs.add(a[i]);
			
		}
		for(int no:hs) {
			
			System.out.print(no+ " ");
		}

	}

}
