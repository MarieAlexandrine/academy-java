package week2;

 class Dog extends Pet{
	 
	public Dog( String name) {
		super(name, "dog"); // call the Pet constructor
		
	
	}
@Override
public String speak() {
    return "Woof!";
  }

}
