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

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Methods {
	
	/*
	 * It takes a string as input and calculates the number of unique combinations where a palindrome is formed.
	 * Input: "abcba"
	 * Output: 5 (Explanation: "a", "b", "c", "b", "abcba" are palindromes)
	 */
	static int count = 0;
    static Set<String> uniqueCombinations = new HashSet<>(); 
	public static void countPalindromeMethod(String inputString, int start, String combination) {
		 if (start == inputString.length()) {
			 return;
	     }
		 if (!combination.isEmpty() && !uniqueCombinations.contains(combination)) {
			 uniqueCombinations.add(combination);
			 if (isPalindrome(combination, 0, combination.length() - 1)) {
				 count++; 
	         }
		 }
		 generateCombinations(inputString, start, combination);
	}
    public static void generateCombinations(String inputString, int index, String combination) {
    	if (index == inputString.length()) {
    		return;
        }
    	countPalindromeMethod(inputString, index + 1, combination + inputString.charAt(index));
        generateCombinations(inputString, index + 1, combination);
    }
    public static boolean isPalindrome(String str, int start, int end) {
    	if (start >= end) {
            return true;
        }
    	if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
    	return isPalindrome(str, start + 1, end - 1);
    }
	
	/*
	 * This program is to print the nth number in the Fibonacci series without using loops.
	 */
	public static int nthFibonaciiMethod(int inputNumber) {
		if(inputNumber == 0 || inputNumber == 1 ) {
			return inputNumber;
		}else {
			return nthFibonaciiMethod(inputNumber-1) + nthFibonaciiMethod(inputNumber-2);
		}
	}
	
	/*
	 * It take user inputs a string in snake_case. If the string is not in snake_case, first convert it to snake_case, and then to camelCase.
	 * Input: "this_is_an_example"
	 * Output: "thisIsAnExample"
	 */
	public static void snakeToCamelMethod(String inputString,String outputString, int intial) {
		if(intial == inputString.length()) {
			System.out.println(outputString);
			return;
		}
		if(inputString.charAt(intial) != '_' && inputString.charAt(intial) != ' ') {
			outputString = outputString + Character.toLowerCase(inputString.charAt(intial));
		}else {
			if(inputString.charAt(intial+1) != '_' && inputString.charAt(intial+1) != ' ') {
				outputString = outputString + Character.toUpperCase(inputString.charAt(intial+1));
				intial++;
			}else {
				outputString = outputString + "";
			}
		}
		snakeToCamelMethod(inputString, outputString, intial + 1);
	} 
	
	/*
	 * It takes a string as input and finds the number of consonants in the string.
	 * Example:
	 * Input: "hello world"
	 * Output: 7
	 */
	public static void countsConstantMethod(char[] changeStringToChar,int initialize,int result) {
		if(initialize == changeStringToChar.length) {
			System.out.println(result);
			return;
		}
		if(changeStringToChar[initialize] != 'a' && changeStringToChar[initialize] != 'u' && changeStringToChar[initialize] != 'e' && changeStringToChar[initialize] != 'i' && changeStringToChar[initialize] != 'o' && changeStringToChar[initialize] != 'A' && changeStringToChar[initialize] != 'E' && changeStringToChar[initialize] != 'I' && changeStringToChar[initialize] != 'O' && changeStringToChar[initialize] != 'U' && ((changeStringToChar[initialize] >= 'a' && changeStringToChar[initialize] <='z') || (changeStringToChar[initialize] >= 'A' && changeStringToChar[initialize] <='Z'))) {
			result ++;
			countsConstantMethod(changeStringToChar, initialize + 1,result);
		}else {
			countsConstantMethod(changeStringToChar, initialize + 1,result);
		}
	} 
	
	/*
	 * It takes an integer in binary format and converts it to its decimal representation..
	 * Input: "1101"
	 * Output: 13
	 */
	public static int binaryToDecimalMethod(int inputNumber, int power) {
		if(inputNumber == 0) {
			return 0;
		}else {
			int lastDigit = inputNumber % 10;
			int remainingDigit = binaryToDecimalMethod(inputNumber/10 , power + 1);
			return lastDigit * (int) Math.pow(2, power) + remainingDigit;
		}
	}	
	
	static String method;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Constant constant = new Constant();	   
        char repeatMain;
		do {
			System.out.println(constant.COUNT_PALINDROME_METHOD);
			System.out.println(constant.NTH_FIBONACII_METHOD);
			System.out.println(constant.SNAKE_TO_CAMEL_METHOD);		
			System.out.println(constant.COUNTS_CONSTANT_METHOD);
			System.out.println(constant.BINARY_TO_DECIMAL_METHOD);
			System.out.println(constant.ENTER_INPUT);
			method = input.nextLine();	
			char repeatTask;	
			switch(method) {
			case "1" : 
				do {
					System.out.println(constant.ENTER_STRING);
					String usersString = input.nextLine();
					countPalindromeMethod(usersString, 0, "");
					System.out.println(count);
					System.out.println(constant.REPEAT_TASK);
					repeatTask = input.next().charAt(0);
				}while(repeatTask == 'Y' || repeatTask == 'y');
				break;
			case "2" :
				do {
					try {
						System.out.println(constant.ENTER_NUMBER);
						int inputNUmber = input.nextInt();
						System.out.println(nthFibonaciiMethod(inputNUmber));
					}catch(Exception e) {
		        		System.out.println(constant.INVALID_USER_INPUT);
					} 	
		            input.nextLine();
					System.out.println(constant.REPEAT_TASK);
					repeatTask = input.next().charAt(0);
				}while(repeatTask == 'Y' || repeatTask == 'y');
				break;
			case "3" : 
				do {
					System.out.println(constant.ENTER_STRING);
					String userString = input.nextLine();
					userString =  userString.trim();
					String outputString = "";
					int intial = 0;
					snakeToCamelMethod(userString, outputString, intial);
					System.out.println(constant.REPEAT_TASK);
					repeatTask = input.next().charAt(0);
				}while(repeatTask == 'Y' || repeatTask == 'y');
				break;
			case "4" :
				do {
					System.out.println(constant.ENTER_STRING);
					String inputString = input.nextLine();
					char[] changeStringToChar = inputString.toCharArray();
					int initalize = 0;
					int result = 0;
					countsConstantMethod(changeStringToChar, initalize, result);
					System.out.println(constant.REPEAT_TASK);
					repeatTask = input.next().charAt(0);
				}while(repeatTask == 'Y' || repeatTask == 'y');
				break;
			case "5" : 
				do {
					try {
						System.out.println(constant.ENTER_NUMBER);
						int inputNumber = input.nextInt();
						String inputStr = String.valueOf(inputNumber);
						boolean isValidBinary = inputStr.matches("[01]+");
						if(!isValidBinary) {
							System.out.println(constant.INVALID_INPUT);
						}else {
							int power = 0 ;
							System.out.println(binaryToDecimalMethod(inputNumber, power));
						}
					}catch(Exception e) {
		        		System.out.println(constant.INVALID_INPUT);
					}
		            input.nextLine();
					System.out.println(constant.REPEAT_TASK);
					repeatTask = input.next().charAt(0);
				}while(repeatTask == 'Y' || repeatTask == 'y');
				break;
			default:
				System.out.println(constant.INVALID_METHOD);
				break;
			}
			System.out.println(constant.REPEAT_METHOD);
			repeatMain = input.next().charAt(0);
			input.nextLine();
		}while(repeatMain == 'Y' || repeatMain == 'y');
        System.out.println(constant.PROGRAM_ENDED);
	}
}
