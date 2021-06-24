package arrayPrograms;

public class arrayDivideBy7 {

	public static void main(String[] args) {

		
		int[] arrayDiv = { 1,1,1,1,1,1,1,1,4,7 ,7} ;
		 int sum = 0;
		for(int i = 0 ; i<arrayDiv.length;i++) {
			
			
			if (arrayDiv[i] % 7 == 0) {
				
				sum += arrayDiv[i] ;	
			}
		}
		
	System.out.print("Sum of Array element which is divide by 7 is  : "+sum);
		
		
	}

}
