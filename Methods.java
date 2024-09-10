/***
 * Taking input from the user with Method they want to perform.
 * Following Methods are perform - 
 * 1 - Combination of String
 * 2 - Digit Sum Loop
 * 3 - Consecutive Number Scanner
 * 4 - Caeser Cipher with Shift Variability
 * 5 - Encoding challenge with ASCII conversion
 * Created by - Kiran Choudhary
 * Date - 10 September 2024
 */

package Assigment_3;

import java.util.Scanner;

public class Methods {
	
	/*
	 * It generate all valid combinations of a string pairs of parentheses. Each combination is unique and well-formed.
	 * Example : 
	 * Input: n = ab;
	 * Output: ['a', 'b', 'ab', 'ba']
	 */
	
	public static void PromptCombination(String inputString, int start, String combination){
		 if (!combination.isEmpty()) {
	            System.out.println(combination);
	     }
	     for (int i = start; i < inputString.length(); i++) {
	        	PromptCombination(inputString, i + 1, combination + inputString.charAt(i));
	        }
	}
	
	/*
	 *It takes a input and  replace it with the sum of digits until the number is reduced to a single digit.
	 *Example : 
	 *Input : 9875
	 *Output : 2 
	 */
	public static void DigitSumLoop(int number){
		Constant constant = new Constant();
		if(number < 10){
			System.out.println(constant.ALREADY_SINGLE_DIGIT);
		}else if(number<0) {
			System.out.println(constant.INVALID_INPUT);
		}else {
			while(number >= 10) {
				int addSingleDigit = 0;
				while(number > 0) {
					addSingleDigit += number % 10;
					number /= 10;
				}
				number = addSingleDigit;
			}
			System.out.println(number);
		}
	}
	
	/*
	 * It finds whether a given number can be expressed as the sum of two or more consecutive natural number.
	 * Example : 
	 * Input : 15
	 * Output : 
	 * 1 + 2 + 3 + 4 + 5
	 * 4 + 5 + 6
	 * 7 + 8
	 */
	public static void ConsecutiveNumberScanner(int inputNumber){
		Constant constant = new Constant();
		if(inputNumber < 0) {
			System.out.println(constant.INVALID_INPUT);
		}else {
			for(int i = 1; i < inputNumber; i++) {
				int sumOfNaturalNumber = 0 ;
				for(int j = i; sumOfNaturalNumber < inputNumber; j++) {
					sumOfNaturalNumber += j;
					if(sumOfNaturalNumber == inputNumber) {
						for(int k = i;k < j;k++) {
							System.out.print(k+" "+"+"+" ");
						}
						System.out.print(j);
						System.out.println();
					}
				}
			}
		}
	}
	
	/*
	 *It take an input string and a shift pattern array. For each character in string, apply the corresponding shift value from the pattern array. If pattern length is shorter than the input string, repeat the pattern
	 *Example : 
	 *Input : "HELLO WORLD" , Shift Pattern : [1, 2, 3]
	 *Output : "IGOMQ ZPTOE" (Shifts: 'H' +1, 'E' +2, 'L' +3, 'L' +1, 'O' +2, etc.)
	 */
	public static void CaeserCipherWithShiftVariability(String input, int[] array){
    	char[] changeString = input.toCharArray();
        for (int i = 0; i < changeString.length; i++) {
            int asciiValue = (int) changeString[i];
        }
        for(int i = 0; i < changeString.length; i++) {
            if (changeString[i] == ' ') {
            	System.out.print(' ');  
                continue;
            }
        	int shift = changeString[i] + array[i % array.length];
        	char changeToChar = (char) shift;
            System.out.print(changeToChar);
            System.out.println();

        }
	}
	
	/*
	 * It takes an unsorted array of digits and a series of integers. It encodes the highest digits, based on the provided series, into their corresponding ASCII characters.
	 * Input: Array: 2315, Series: 123
	 * Output: "535150"
	 * Explanation: The three highest numbers 5, 3, 2 are converted to ASCII characters.
	 */
	public static void EncodingChallengeWithASCIIConversion(int[] inputArray, int[] seriesArray){
    	String emptyString = "";
    	for(int i = 0 ; i < inputArray.length-1; i++) {
			for(int j = 0; j < inputArray.length -1 -i;j++) {
				if(inputArray[j] < inputArray[j+1]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = temp;
					}
				}
			}	
    	for(int i = 0 ; i < seriesArray.length; i++) {
			if(seriesArray[i] > inputArray.length ) {
				System.out.println("Invalid Input");
			}else {
				emptyString += (inputArray[seriesArray[i] - 1] + 48);
			}
		}
		System.out.print(emptyString);
    	
	}
	
	static String method;
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Constant constant = new Constant();
		while(true) {			
			System.out.println(constant.PROMPT_COMBINATION);
		    System.out.println(constant.DIGIT_SUM_LOOP);
		    System.out.println(constant.CONSECUTIVE_NUMBER_SCANNER);
		    System.out.println(constant.CAESER_CIPHER_WITH_SHIFT_VARIABLITY);
	     	System.out.println(constant.ENCODING_CHALLENGE_WITH_ASCII_CONVERSION);
	     	System.out.println(constant.ENTER_INPUT);
	     	method = userInput.nextLine();	     	
		    switch(method) {
	        case "1" : 
	        	 System.out.println(constant.ENTER_STRING);
	             String inputString = userInput.nextLine();
	             PromptCombination(inputString , 0 , "");
	             break;
	        case "2" : 
	        	try{
	        		System.out.println(constant.ENTER_NUMBER);
	        		int number = userInput.nextInt();
	        		DigitSumLoop(number);
	        	}catch(Exception e) {
	        		System.out.println(constant.INVALID_INPUT);
	        	}
	        	break;	        
	        case "3" : 
	        	try{
	        		System.out.println(constant.ENTER_NUMBER);
	        		int inputNumber = userInput.nextInt();
	        		ConsecutiveNumberScanner(inputNumber);
	        	}catch(Exception e) {
	        		System.out.println(constant.INVALID_INPUT);
	        	}
	        	break;	        
	        case "4" : 
	        	System.out.println(constant.ENTER_STRING);
	        	String input = userInput.nextLine();
	        	System.out.println(constant.SIZE);
        		int size = userInput.nextInt();
        		userInput.nextLine();
        		int[] array = new int[size];
        		System.out.println("Enter the array : ");
        		for(int i = 0 ;i < size;i++) {
        			array[i] = userInput.nextInt();
        		}
        		CaeserCipherWithShiftVariability(input, array);
	        	break;	        
	        case "5" : 
	        	try {
	        		System.out.println(constant.ARRAY_LENGTH);
	        		int length = userInput.nextInt();
	        		int[] inputArray = new int[length];
	        		System.out.println(constant.ARRAY);
	        		for(int i = 0 ;i < length;i++) {
	        			inputArray[i] = userInput.nextInt();
	        		}
	        		System.out.println(constant.SERIES_SIZE);
	        		int seriesSize = userInput.nextInt();
	        		int[] seriesArray = new int[seriesSize];
	        		System.out.println(constant.ARRAY);
	        		for(int i = 0 ;i < seriesSize;i++) {
	        			seriesArray[i] = userInput.nextInt();
	        		}
	        		EncodingChallengeWithASCIIConversion(inputArray, seriesArray);
	        	}catch(Exception e) {
	        		System.out.println(constant.INVALID_INPUT);
	        	}
	        	break;
		    }
		}
	}
}
