import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RentalStatement {
	private String name;
	private BigDecimal totalAmount;
	private BigDecimal calculateFee;
	private List<Rental> rentals = new ArrayList<Rental>();

	public RentalStatement(String customerName) {
		this.name = customerName;
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public String makeRentalStatement() {

		return makeHeder() + makeRentalLine() + makeSummary();
	}

	private String makeHeder() {
		return "Rental record for " + getName() + "\n";
	}

	private String makeRentalLine() {
		String rentalLines = "";
		for (Rental rental : rentals)
			rentalLines += makeRentalLine();
		return rentalLines;
	}

	private String makeRentalLine(Rental rental){
	BigDecimal thisAmount = rental.calculateFees();
	//  BigDecimal totalAmount += thisAmount;
	return formatRentalLine(rental, thisAmount);
}

	private String formatRentalLine(Rental rental, BigDecimal thisAmount) {
		// TODO Auto-generated method stub
		return null;
	}

	private String makeSummary() {
		return "You owed  " + totalAmount;
	}
}
