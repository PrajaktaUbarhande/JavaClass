package BasicPrograms;

public class NumberPattern {

	public static void main(String[] args) {
			

        for (int i = 4; i >= 0; i--)
        {
        	
        	
        	char ch = 'A';
        	for (int j = 0; j <= i; j++)
            {
			
				System.out.print(ch+" ");
				ch++;
	
			}
			System.out.println();	
				
			
		}
        

//   	 for (int i1 = 4; i1 >= 0; i1--)
//        {
//        	for( int j = 1 ; j<=i1;j++) {
//    			System.out.print("  ");
//    		}// space 
//    			
//        	
//        	char ch1 = 'A';
//        	for (int j = 0; j <= i1; j++)
//            {
//			
//				System.out.print(ch1+" ");
//				ch1++;
//	
//			}
			//System.out.println();	
			
			
		//}
			for (int i= 4; i>= 1; i--)
		    {
		    for (int j=4; j>i;j--)
		    {
		    System.out.print(" ");
		    }
		    char ch1='A';
		    for (int k=1;k<=i;k++)
		    {
		    System.out.print(ch1+" ");
		    //ch1++;
		    }
		    System.out.println("");
		    }
      


} 
	}

