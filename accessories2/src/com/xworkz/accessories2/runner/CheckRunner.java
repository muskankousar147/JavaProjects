package com.xworkz.accessories2.runner;

import java.util.Arrays;

public class CheckRunner {

	public static void main(String[] args) {
		//counting of number of char present in to the sentence without using length
		String sentence = "hii how are you";
		int count = 0;
		for (char c : sentence.toCharArray()) {
		    count++;
		    System.out.println("Number of characters: " + count);
		}
		
	

//	counting of white spaces
	
	for (char ch : sentence.toCharArray()){
		int whiteSpaceCount=0;
	    if (Character.isWhitespace(ch)) {
	        whiteSpaceCount++;
	    }
	        System.out.println("Number of white spaces: " + whiteSpaceCount);
	        
	}
	


	//removing of white spaces
	StringBuilder noSpaces = new StringBuilder();
	for (char k : sentence.toCharArray()) {
	    if (!Character.isWhitespace(k)) {
	        noSpaces.append(k);
	   
	        String resultWithoutSpaces = noSpaces.toString();
	    	System.out.println("Sentence without white spaces: " + resultWithoutSpaces);
	    }
	}
	

//changing the sentence into upper case

for (char m : sentence.toCharArray()) {
	String upperCase = "";
upperCase += Character.toUpperCase(m);
System.out.println("Uppercase sentence: " + upperCase);
}




//changing the sentence into lower case

for (char l : sentence.toCharArray()) {
	String lowerCase = "MUSKAN";
    lowerCase += Character.toLowerCase(l);
    System.out.println("Lowercase sentence: " + sentence);
}


//digit checking

for (char p : sentence.toCharArray()) {
	boolean containsDigit = false;
    if (Character.isDigit(p)) {
        containsDigit = true;
        System.out.println("Contains digit: " + sentence);
        break;
    
    
    
    }
}
	}
}

