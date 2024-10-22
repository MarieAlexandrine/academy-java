package com.bptn.course._week2;

public class Employee {
	private double salary;
	private double hoursPerDay;

	public Employee(double salary, double hoursPerDay) {
		this.salary = salary;
		this.hoursPerDay = hoursPerDay;
		setSalary(salary);
		setHoursPerDay(hoursPerDay);
	}

	public void setSalary(double salary) {
		if (this.salary < 500) {
			this.salary += 10; // Increase salary by 10 if less than 500
		} else {
			this.salary = salary;
		}

	}

	public void setHoursPerDay(double hoursPerDay) {
		if (this.hoursPerDay > 6) {
			this.salary += 5; // Increase salary by 5 if hours per day is more than 6
		}
	}

	public double getSalary() {
		return this.salary;
	}

}
