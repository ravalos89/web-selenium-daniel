package com.java;

import java.io.FileNotFoundException;

import org.openqa.selenium.TimeoutException;

public class Exceptions {
	
	public static void main(String []args) {
		
		String[][] example = new String[2][2];
		
		// ERROR
//		example[10][10] = "Algo";
	
		
		validateNull();
		
	}
	
	// Timeout
	public void wait(int sec) {
		try {
			// Wait 
		}catch(TimeoutException e) {
			
		}
	}
	
	public void readTxtFile(String txtPath) throws FileNotFoundException {
	}
	
	public static void validateNull() {
		try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
        	e.printStackTrace();
            System.out.println("NullPointerException..");
        }
	}
	
	

}
