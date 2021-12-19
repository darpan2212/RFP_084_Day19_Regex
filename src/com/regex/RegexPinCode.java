package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPinCode {

	public static void main(String[] args) {

		String pinCodePattern = "^[0-9]{3}\s?[0-9]{3}$";
		Pattern pincodeRegex = Pattern.compile(pinCodePattern);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the pincode : ");
		String inputStr = sc.nextLine();
		Matcher pinCodeMatcher = pincodeRegex.matcher(inputStr);
		sc.close();
		if (pinCodeMatcher.matches()) {
			System.out.println(inputStr + " is valid pin code.");
		} else {
			System.out.println(inputStr + " is invalid pin code.");
		}
	}

}