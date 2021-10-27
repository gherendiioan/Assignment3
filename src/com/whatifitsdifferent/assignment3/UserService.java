package com.whatifitsdifferent.assignment3;

//import com.whatifitsdifferent.assignment3.User;

//import com.whatifitsdifferent.level2.User;

public class UserService{
	
	public User createUser(String [] inputs) {
		
		User newUser = new User(null, null, null);
		
		newUser.setUsername(inputs[0]);
		newUser.setPassword(inputs[1]);
		newUser.setName(inputs[2]);
		
		return newUser;
		
	}
	
	public String[] parseText(String inputForParsing) {
		
		
		String[] parseString = inputForParsing.split(",");
		
		return parseString;
		}


	
	
}

