package com.whatifitsdifferent.assignment3;

import java.util.Scanner;

public class UserInputScanner {

	String userInputMethod() {

		Scanner userInputScan = new Scanner(System.in);
		String userInput = userInputScan.nextLine();
		userInputScan.close();
		return userInput;

	}

}
