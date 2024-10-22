package com.bptn.course._week3;

public class Abstract {
	abstract class Animal {
		// Abstract Method
		 public abstract void sound();
		// Concrete Method
		 public void sleep() {
		  System.out.println("Animal is sleeping");
		 }
		}


		class Dog extends Animal {
		 @Override
		 public void sound() {
		  System.out.println("Dog barks");
		 }
		}

}
