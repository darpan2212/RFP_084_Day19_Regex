package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		String resultPattern = "^[0-9]*[a-zA-Z]{3}[0-9a-zA-Z]*$";
		Pattern regex = Pattern.compile(resultPattern);
		
		Matcher inputMatcher = regex.matcher("111");
		System.out.println(inputMatcher.matches());
		inputMatcher = regex.matcher("1aaa");
		System.out.println(inputMatcher.matches());
		inputMatcher = regex.matcher("aa11");
		System.out.println(inputMatcher.matches());
		inputMatcher = regex.matcher("bcc");
		System.out.println(inputMatcher.matches());
		inputMatcher = regex.matcher("1a1aab");
		System.out.println(inputMatcher.matches());
		inputMatcher = regex.matcher("1abb23a");
		System.out.println(inputMatcher.matches());
		
	}
	
}