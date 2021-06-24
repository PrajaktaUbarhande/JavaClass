package BasicJavaPrograms;

public class TwoDArray {

	public static void main(String[] args) {
	    
		int[][] b = new int [2][2];
		int no = 0 ;
		
      for ( int i = 0 ; i<2 ; i++) {
			
			for( int j= 0 ;j<2 ;j++) {
				
				 b[i][j] = ++no;   // Pre-Increment  or no++ - Post Increment
				
			}
      }
		
		for ( int i = 0 ; i<2 ; i++) {
			
			for( int j= 0 ;j<2 ;j++) {
				
				System.out.print(b[i][j] + " ");
				no++;
				
			}
			
			
			System.out.println();
		}
		
	}

}
