package com.bptn.course._week2;

public class ExceptionLearning {

	public static void main(String[] args) {
		try {
            //  Block of code to try
            int a = 11;
            int b= 0;
            System.out.println(a/b);
        } catch (Exception e) {
            //  Block of code to handle errors
            System.out.println("The number cannot be divided by zero " + e);
        }

	}

}
