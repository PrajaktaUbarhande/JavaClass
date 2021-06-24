package BasicJavaPrograms;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] names = new String[3][];
		names[0] = new String[3];
		names[1] = new String[2];
		names[2] = new String[1];

		for (int i = 0; i < names.length; i++)
		{

			for (int j = 0; j < names[i].length; j++) 
			{

				System.out.print("Enter Player Name : ");
				names[i][j] = sc.next();
				
			}
			System.out.println("**********Next Array Start*******");

		}
		
		
		System.out.println("*********###########Players Details#########**********");
		for (int i = 0; i < names.length; i++)
		{
				for (int j = 0; j < names[i].length; j++) 
				{

				System.out.print(names[i][j] + " ");
				
				}
			System.out.println();
		}

	}

}
