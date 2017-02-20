import java.math.BigDecimal;

public abstract class Movie {

	private String title;
	private String priceCode;
	public int getDays;

	public Movie(String title, String priceCode) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}


	public void setPriceCode(String priceCode) {
		this.priceCode = priceCode;
	}

	public abstract BigDecimal calculateFees(int days);

}
