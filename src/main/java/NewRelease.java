import java.math.BigDecimal;
import java.util.List;

public class NewRelease extends Movie {
	public NewRelease(String title) {
		super(title ,null); 
	}
	
	
	public String getPriceCode(){
	return "newRelease";
	}
	@Override
	
	public BigDecimal calculateFees(int days){
		
	BigDecimal rentalDays = new BigDecimal(days);
	BigDecimal amount = new BigDecimal("3.00").multiply(rentalDays);
	
	return null;
	}
}
