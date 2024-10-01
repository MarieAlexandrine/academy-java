package _6_OOP;

 class SalesDepartment extends Department{
	 private double totalSalesAmount;

	public SalesDepartment(String departmentName, int numberOfEmployees, double totalSalesAmount) {
		super(departmentName, numberOfEmployees);
		this.totalSalesAmount = totalSalesAmount;
	}
public void showDepartmentInfo() {
	System.out.println("Name of Department: " +getDepartmentName());
	System.out.println("Number of Employees: " +getNumberOfEmployees());
	System.out.println("The total sale amount is: " +totalSalesAmount);
}

}
