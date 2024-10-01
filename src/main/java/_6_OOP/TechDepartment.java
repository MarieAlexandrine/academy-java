package _6_OOP;

class TechDepartment extends Department{
 private double totalPurchaseAmount;
	public TechDepartment(String departmentName, int numberOfEmployees, double totalPurchaseAmount) {
		super(departmentName, numberOfEmployees);
		this.totalPurchaseAmount = totalPurchaseAmount;
	}

}
