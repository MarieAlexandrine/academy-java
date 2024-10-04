package week2;

public class Stock {
	// Create Instance Variables
	private String tickerSymbol;
	private String companyName;
	private int price;
	private double percentChange;
	private int totalShares;
	private long marketCap;

	// Constructor
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol = tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.percentChange = 0;
		this.marketCap = totalShares * price;
	}

//Create the methods
	public void adjustPrice(int change) {

		price += change;
		percentChange = ((double) change / price) * 100;
		marketCap = totalShares * price;
	}

	// toString() method
	public String toString() {
		return "Ticker Symbol: " + tickerSymbol + "\n" + "Company: " + companyName + "\n" + "Current Price: $" + price
				+ " (" + percentChange + "%)" + "\n" + "Market Cap: $" + marketCap;
	}

	public static void main(String[] args) {
		Stock stock = new Stock("goog", "Google, Inc.", 802, 6700);
		System.out.println(stock);
		stock.adjustPrice(20);
		System.out.println(stock);

	}

}
