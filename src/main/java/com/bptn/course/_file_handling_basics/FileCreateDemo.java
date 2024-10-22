package com.bptn.course._file_handling_basics;

import java.io.FileWriter;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("sample.txt");
			writer.write("This is a new file! \nFile handling basics");
			System.out.println("File created!");
			writer.close();
		} catch (IOException e) {
			System.out.println("Something went wrong while creating the file");
			e.printStackTrace();
		}

	}

}
