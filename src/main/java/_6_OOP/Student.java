package _6_OOP;

public class Student { // declares a class name
	

//	    


	private  String studentName;// Declares instance variables
	private  int studentAge;

	public Student(String studentName,int studentAge) { // Defines a constructor
	//Using "this" to refer to the instance variables
  this.studentName = studentName;
  this.studentAge = studentAge;
	}
	public  void studentIdentification() { // declares student Identification method.
		System.out.println("Student name is: " + this.studentName);
		System.out.println("Student Age is: " + this.studentAge);
	}//Main method for testing
	public  static void main (String args []) {
		Student myStudent = new Student ("Marie", 16);//create new object myStudent 
		myStudent.studentIdentification();// call to studentIdentification method to print name and age.
	}
}
		
	

	

