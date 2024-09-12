/***
 * Taking input from the user with Method they want to perform.
 * Following Methods are perform - 
 * 1 - Count Palindrome 
 * 2 - Nth Fibonacii
 * 3 - Snake to Camel
 * 4 - Counts Constant
 * 5 - Binary to Decimal
 * Created by - Kiran Choudhary
 * Date - 11 September 2024
 */

package Assignment;

import java.util.Scanner;

public class Methods {
	
	/*
	 * It takes a string as input and calculates the number of unique combinations where a palindrome is formed.
	 * Input: "abcba"
	 * Output: 5 (Explanation: "a", "b", "c", "b", "abcba" are palindromes)
	 */
	public static void countPalindrome() {
		
	}
	
	/*
	 * This program is to print the nth number in the Fibonacci series without using loops.
	 */
	public static void nthFibonacii() {
		
	}
	
	/*
	 * It take user inputs a string in snake_case. If the string is not in snake_case, first convert it to snake_case, and then to camelCase.
	 * Input: "this_is_an_example"
	 * Output: "thisIsAnExample"
	 */
	public static void snakeToCamel() {
	
	} 
	
	/*
	 * It takes a string as input and finds the number of consonants in the string.
	 * Example:
	 * Input: "hello world"
	 * Output: 7
	 */
	public static void countsConstant(char[] changeStringToChar,int initialize,int result) {
		if(initialize == changeStringToChar.length) {
			System.out.println(result);
			return;
		}
		if(changeStringToChar[initialize] != 'a' && changeStringToChar[initialize] != 'u' && changeStringToChar[initialize] != 'e' && changeStringToChar[initialize] != 'i' && changeStringToChar[initialize] != 'o') {
			result ++;
			countsConstant(changeStringToChar, initialize + 1,result);
		}else {
			countsConstant(changeStringToChar, initialize + 1,result);
		}
	} 
	
	/*
	 * It takes a string as input and finds the number of consonants in the string.
	 * Input: "hello world"
	 * Output: 7
	 */
	public static void binaryToDecimal() {
	
	}

	
	static String method;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Constant constant = new Constant();
		while(true) {
			System.out.println(constant.COUNT_PALINDROME_METHOD);
		    System.out.println(constant.NTH_FIBONACII_METHOD);
		    System.out.println(constant.SNAKE_TO_CAMEL_METHOD);
		    System.out.println(constant.COUNTS_CONSTANT_METHOD);
	     	System.out.println(constant.BINARY_TO_DECIMAL_METHOD);
	     	System.out.println(constant.ENTER_INPUT);
	     	method = input.nextLine();	     	
		    switch(method) {
	        case "1" : 
	        	break;
	        case "2" :
	        	break;
	        case "3" : 
	        	break;
	        case "4" :
	        	System.out.println(constant.ENTER_STRING);
	        	String inputString = input.nextLine();
	    		char[] changeStringToChar = inputString.toCharArray();
	    		int initalize = 0;
	    		int result = 0;
	    		countsConstant(changeStringToChar, initalize, result);
	        	break;
	        case "5" : 
	        	break;
		    }
		}
	}
}
