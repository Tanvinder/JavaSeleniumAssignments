package conditions;

public class learnif {

	public static void main(String[] args) {
		int age = 40;
		if(age < 18)
			System.out.println("Child");
			else if(age >= 18 && age < 60)
				System.out.println("Adult");
			else 
				System.out.println("senior");
	}

}
