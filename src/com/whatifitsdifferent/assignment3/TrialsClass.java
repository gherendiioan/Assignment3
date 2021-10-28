package com.whatifitsdifferent.assignment3;

import java.io.IOException;

public class TrialsClass {

	public static void main(String[] args) throws IOException {
		
//		Initializing the FileReaderClass 
		
		FileReaderClass tryMe = new FileReaderClass();

		String[] fileReadingInput = tryMe.fileReadingMethod();
		System.out.println(fileReadingInput[0]);
		System.out.println(fileReadingInput[1]);
		System.out.println(fileReadingInput[2]);
		System.out.println(fileReadingInput[3]);
		
//		initializing user service
		
		UserService userServiceTrial = new UserService();

		String[] parseInputTrialUser1 = userServiceTrial.parseText(fileReadingInput[0]);
		String[] parseInputTrialUser2 = userServiceTrial.parseText(fileReadingInput[1]);
		String[] parseInputTrialUser3 = userServiceTrial.parseText(fileReadingInput[2]);
		String[] parseInputTrialUser4 = userServiceTrial.parseText(fileReadingInput[3]);
		System.out.println(parseInputTrialUser1[0]);
		
//		initializing User
		
		User user1 = userServiceTrial.createUser(parseInputTrialUser1);
		User user2 = userServiceTrial.createUser(parseInputTrialUser2);
		User user3 = userServiceTrial.createUser(parseInputTrialUser3);
		User user4 = userServiceTrial.createUser(parseInputTrialUser4);

		System.out.println(user3.getName());
		
//		initializing scanner
		
		UserInputScanner tryThisNow = new UserInputScanner();

//		tryThisNow.userInputMethod();

//		System.out.println("you have selected: " + userVar );

		int numOfTrials = 5;

		while (numOfTrials >= 0) {
			System.out.println("Enter your email: ");

			String usernameInput = tryThisNow.userInputMethod();
			
			System.out.println("Enter your password: ");
			
			String passwordInput = tryThisNow.userInputMethod();
		
			
			if (usernameInput.equalsIgnoreCase(user4.getUsername()) == true && (passwordInput.equals(user4.getPassword()))) {
				System.out.println("Welcome " + user4.getName());
				break;
			} else {
				if (numOfTrials == 0) {
					System.out.println("Account Blocked");
					break;
				} else {
					numOfTrials--;
					System.out.println("Try again");
				}

			}

		}

	}

}
