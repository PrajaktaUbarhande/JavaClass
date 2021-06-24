package arrayPrograms;

public class GcdNumber {

	public static void main(String[] args) {
	
        int num1 = 55, num2 = 121, gcd = 1;

        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0) {
                gcd = i;
            }
        }
		
        System.out.print("GCD is " + gcd);
	}

}
