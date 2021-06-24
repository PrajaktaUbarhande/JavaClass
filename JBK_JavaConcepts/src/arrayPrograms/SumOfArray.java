package arrayPrograms;

public class SumOfArray {

	public static void main(String[] args) {

		int[] sumOfArray = { -17, -12, 14, -18, -19, 1 ,1 ,1};

		int Negetivesum = 0 ,positiveSum=0 ; ;

		for (int i = 0; i < sumOfArray.length; i++) {

//			  if(sumOfArray[i]<0){
//				  positiveSum = positiveSum +sumOfArray[i];
//				  
//	            }
//	            else{
//	                Negetivesum =Negetivesum +sumOfArray[i];
//	            }
//	        }
//	        //System.out.println("Sum of positive numbers: "+positiveSum);
//	       // System.out.println("Sum of negative numbers: "+Negetivesum);
//	        
	        if (sumOfArray[i]% 2==0) {
	        	
	        	positiveSum = sumOfArray[i]+positiveSum ;
	        	
	        }
	        
		}
	        
		System.out.println(positiveSum);     
	        
	        
	}
	}

