package arrayPrograms;

public class FindDuplicateElements {

	public static void main(String[] args) {

		String[] arrayDup = { "Hi","Hell","Hi","Good","Okay","Okay"};

		System.out.println("Duplicate Array is :");

		for (int i = 0; i <= arrayDup.length - 1; i++) {
			

			for (int j = i + 1; j <= arrayDup.length-1; j++) {

				if ((arrayDup[i] == arrayDup[j]) && (i != j)) {

					System.out.print(arrayDup[j] + " ");
				}

			}

		}

	}

}
