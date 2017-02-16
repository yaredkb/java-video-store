
public class VideoStoreApp {

	public static void main(String[] args) {

		RentalCalculator calculator = new RentalCalculator();
		Movie regular = new Movie("WCCI", "regular");
		Movie childrens = new Movie("Up", "childrens");
		Movie newRelease = new Movie("Dr Strnage", "new release");
		
		System.out.println("amount due = " + calculator.calculate(regular, 2));
		System.out.println("amount due = " + calculator.calculate(regular, 3));
		System.out.println("amount due = " + calculator.calculate(regular, 5));
		
		System.out.println("amount due = " + calculator.calculate(childrens, 3));
		System.out.println("amount due = " + calculator.calculate(childrens, 4));
		System.out.println("amount due = " + calculator.calculate(childrens, 5));

		System.out.println("amount due = " + calculator.calculate(newRelease, 1));
		System.out.println("amount due = " + calculator.calculate(newRelease, 5));

		
	}

}
