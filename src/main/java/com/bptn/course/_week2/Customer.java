package week2;
 class Customer {
	 private String customerID;
	 private String customerName;
	 private String  customerEmail;
	 private ShoppingCart cart;
	 
	 public Customer (String customerID, String customerName, String customerEmail, ShoppingCart cart) {
		 this.customerID = customerID;
		 this.customerName = customerName;
		 this.customerEmail = customerEmail;
		 this.cart = new ShoppingCart();
		 
	 }
public String getCustomerName () {
	return this.customerName;
}
public ShoppingCart getCart() {
	return this.cart;
}
public void checkout () {
	System.out.println("Proceesing order for " +customerName);
}
}
