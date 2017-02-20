
public class VideoStoreApp {

	public static void main(String[] args) {
		RentalStatement RStatement = new RentalStatement("Tom");
		RStatement.getName();
		RStatement.makeRentalStatement();
		System.out.println("Wellcome To the Movie Rental  " + " " + RStatement.makeRentalStatement());
		
		
  
		Movie regular = new RegularMovie("WCCI");
		Movie childrens = new ChildrensMovie("Up");
		Movie newRelease = new NewRelease("Dr Strnage");
	
}
}

