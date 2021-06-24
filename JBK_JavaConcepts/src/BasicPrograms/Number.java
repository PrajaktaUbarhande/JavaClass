package BasicPrograms;

public class Number {

	public static void main(String[] args) {
		
//****** print following number pattren *********	
//		 1
//		1 2
//	   1 2 3
//	  1 2 3 4
//	 1 2 3 4 5 
		
//		for (int i = 1; i <= 5; i++)  // for rows
//		{
//			for (int j = 5; j >= i; j--)  // for colm
//			{
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= i; k++) 
//			{
//				System.out.print(k + "  ");
//
//			}
//			System.out.println();
//		}

		//****** print following number pattern *********	
		
//		 1
//		2 3
//	   4 5 6
//	  7 8 9 10
		
//		int count = 1; 
//		 for ( int i = 1 ; i <=4 ;i++) {
//			 for (int j=4;j>=i;j--) {
//				 System.out.print(" ");	 
//			 }
//			 for ( int k=1 ; k<=i;k++,count++) {
//				 System.out.print(count+ " ");
//			 }
//			 System.out.println();
//		 }
	
//		1 
//		1 1 
//		1 1 1 
//		1 1 1 1 	
		
// int n = 4;
// for(int i=1;i<=n;i++) {
//	 for(int j =1;j<=i;j++) {
//		 System.out.print("1 ");
//	 }
//	 System.out.println();
// }
//
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		 int n = 4;
//		 for(int i=1;i<=n;i++) {
//			 for(int j =1;j<=i;j++) {
//				 System.out.print(i +" ");
//			 }
//			 System.out.println();
//		 }
		 
//		4 
//		3 3 
//		2 2 2 
//		1 1 1 1 
//		
		
		 int n = 4;
		 for(int i=1,p=4;i<=n;i++,p--) {
			 	 for(int j =1;j<=i;j++) {
				 System.out.print(p+" ");
				
			 }
			 System.out.println();
		 }
		 
		 
}
}

