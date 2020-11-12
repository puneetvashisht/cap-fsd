package com.capgemini.day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {
	
	public static void validatePassword(String password) {
		
		String regex = "^"
				+ "(?=.*[0-9])"
				+ "(?=.*[a-z])"
				+ "(?=.*[A-Z])"
				+ "(?=.*[@#$%^&+=])"
				+ "(?=\\S+$).{8,}$";
		// form a pattern with regex
		Pattern pattern = Pattern.compile(regex);
		// matcher method.. matcher
		Matcher matcher = pattern.matcher(password);
	    System.out.println(password +" : "+ matcher.matches());
	}
	
	
	public static void validateEmail(String email) {
		String regex = "^(.+)@(.+)$";
		// form a pattern with regex
		Pattern pattern = Pattern.compile(regex);
		// matcher method.. matcher
		Matcher matcher = pattern.matcher(email);
	    System.out.println(email +" : "+ matcher.matches());
	}
	
	public static void main(String[] args) {
		
		String input = "This is the line which I want to scan. is this going to work??";
		
		Pattern pattern = Pattern.compile("is");
		
		Matcher matcher = pattern.matcher(input);
		
		while(matcher.find()) {
			System.out.println(matcher.start() + " , " + matcher.end());
			System.out.println(matcher.group());
		}
		
		validateEmail("puneetvashishtgmail.com");
		validatePassword("Test@123");
				
	}

}
