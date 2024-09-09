/***
 * Taking input from the user with Method they want to perform.
 * Following Methods are perform - 
 * 1 - Combination of String
 * 2 - Digit Sum Loop
 * 3 - Consecutive Number Scanner
 * 4 - Caeser Cipher with Shift Variability
 * 5 - Encoding challenge with ASCII conversion
 */

package Assigment_3;

import java.util.Scanner;

public class Methods {
	
	public static void CombinationOfString(String inputString, int start, String combination){
		 if (!combination.isEmpty()) {
	            System.out.println(combination);
	        }
	        for (int i = start; i < inputString.length(); i++) {
	            CombinationOfString(inputString, i + 1, combination + inputString.charAt(i));
	        }
	}
	
	public static String DigitSumLoop(){
	
		return null;
	}
	
	public static String ConsecutiveNumberScanner(){
	
		return null;
	}
	
	public static String CaeserCipherWithShiftVariability(){
	
		return null;
	}
	
	public static String EncodingChallengeWithASCIIConversion(){
	
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Constant constant = new Constant();
		while(true) {
			
			System.out.println(constant.COMBINATION_OF_STRING);
		    System.out.println(constant.DIGIT_SUM_LOOP);
		    System.out.println(constant.CONSECUTIVE_NUMBER_SCANNER);
		    System.out.println(constant.CAESER_CIPHER_WITH_SHIFT_VARIABLITY);
	     	System.out.println(constant.ENCODING_CHALLENGE_WITH_ASCII_CONVERSION);
	     	System.out.println(constant.ENTER_INPUT);
	     	String method = sc.nextLine();
	     	
		    switch(method) {
	        case "1" : 
	        	 System.out.println(constant.ENTER_STRING);
	             String inputString = sc.nextLine();
	             CombinationOfString(inputString , 0 , "");
	        	
	             break;
	        
	        case "2" : System.out.println(DigitSumLoop());
	        break;
	        
	        case "3" : System.out.println(ConsecutiveNumberScanner());
	        break;
	        
	        case "4" : System.out.println(CaeserCipherWithShiftVariability());
	        break;
	        
	        case "5" : System.out.println(EncodingChallengeWithASCIIConversion());
	        break;
	        
	        default : System.out.println(constant.INVALID_INPUT); 
	        
	  
		}
	}

	}
}
