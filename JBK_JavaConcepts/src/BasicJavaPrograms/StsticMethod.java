package BasicJavaPrograms;

public class StsticMethod {

	int pId;
	String occupation;
	static String County = "India";

	StsticMethod(int p, String oc) {

		pId = p;
		occupation = oc;

	}

	void display() {
		System.out.println("peopleId   : " + pId);
	    System.out.println("occupation : "+ occupation);
	}

	static void show() {
		System.out.println("Conutry  : " + (StsticMethod.County));
	}
}

class TestPepole {

	public static void main(String[] args) {

		StsticMethod p1 = new StsticMethod(1, "programming");
		StsticMethod p2 = new StsticMethod(2, "Doctor");

		p1.display();
		p2.display();
		StsticMethod.show();

	}
}
