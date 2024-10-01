package _6_OOP;

 class Department { //class declaration
	 //Data members
	 private String departmentName;
	 private int numberOfEmployees;
	 public Department (String departmentName, int  numberOfEmployees) { //Constructor
			this.departmentName = departmentName;
			this.setNumberOfEmployees(numberOfEmployees);
	 }
	public void showDepartmentInfo ( ) { //Method 
		System.out.println("Name of Department" + departmentName); //Method body
		System.out.println("Number of Employees: " +getNumberOfEmployees());
		
		
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public String getDepartmentName () {
		return departmentName;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

}
