package com.capgemini.day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.day5.Employee;

public class FileReadDemo {

	public static void main(String[] args) {
		
		File file = new File("/home/puneet/work/trainings/cagemini-fsd/java-demo/src/sample.txt");
		Scanner scanner = null;
		
//		scanner = new Scanner(file);
		
		try {
			
			scanner = new Scanner(file);
			
			
			if(scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
		
		System.out.println("allz well.. file has been found");

	}

}
