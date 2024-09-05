/***
 * In this program the user will first enter a string. After that, the program should ask the user which operation they want to execute on the string.
 * Following operation user can performed :
 * Append                    
 * CountWord         
 * Replace            
 * isPalindrome         
 * Splice    
 * Split 
 * MaxRepeatingCharacter                     
 * Sort 
 * Shift 
 * Reverse            
 * Created by - Kiran Choudhary
 * Date - 4 September
 */

package Assigment;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsToImplement {
	
	public static String Append(String currentString) {                 
		/*For adding newString provided by the user to the existing string
		  Example - String currentString = "Hello"
	      append("World"); = // Result : "Hello World"*/
		
		Scanner append = new Scanner(System.in);
		Constant constant = new Constant();
	    System.out.println(constant.ENTER_STRING);
		String inputString = append.next();
		String result = currentString + " " + inputString;
		 
		return result;
	
	}
	
	public static int CountWord(String currentString) {
		/*For counting the total number of words in the current string
		 Example - String text = "Hello World from Codeup"
         int wordCount = countWords(); // Result : 4
		 */

		int countWord = 0;
		char[] stringToChar = currentString.toCharArray();
		for(int i = 0; i < stringToChar.length;i++) {
			if(stringToChar[i] != ' ' && (i == 0 || stringToChar[i-1] == ' ')) {
				countWord++;
			}
		 }
		return countWord;
		
	}
	
	public static String Replace(String currentString) {
		/* For replacing all occurrences of character a with character b in current string
            Example - String text = "Java Programming"
            replace('a', 'o'); // Result : "Jovo Progromming"
		 */
		
		Scanner replace = new Scanner(System.in);
		Constant constant = new Constant();
		char[] stringToChar = currentString.toCharArray();
		System.out.println(constant.OUTPUT1);
		String toChangeChar = replace.nextLine();
		System.out.println(constant.OUTPUT2);
		String changeChar = replace.nextLine();
		for(int i = 0; i<stringToChar.length; i++ ) {
			if(stringToChar[i] == toChangeChar.charAt(0)) {
				stringToChar[i] = changeChar.charAt(0);
			 }
		 }
		return new String(stringToChar);
	
	}
	
	public static boolean isPalindrome(String currentString) {
		/*For checking if the current string is Palindrome or not
          Example - String text = "madam"
          boolean isPal = isPalindrome(); // Result : true
		*/
		
		char[] toChangeChar = currentString.toCharArray();
		char[] str2 = currentString.toCharArray();
		int a = 0 ;
		int b = toChangeChar.length -1;
		while(a<b) {
			char temp = toChangeChar[a];
			toChangeChar[a] = toChangeChar[b];
			toChangeChar[b] = temp;
			if(Arrays.equals(toChangeChar, str2)) {
				return true;
			}else {
				return false;
			}
	
		}
		return true;
	}
	
	public static String Splice(String currentString) {
		/*For removing a substring from the current string starting at index start and of length length
          Example - String text = "Academy"
          splice(2, 2); // Result : "Acemy"
		 */
		Scanner sc = new Scanner(System.in);
		char[] toChangeChar = currentString.toCharArray();
		String s = "";
		String s2 = "";
		Constant constant = new Constant();
		System.out.println(constant.SLICE_START1);
		int start = sc.nextInt();
		System.out.println(constant.SLICE_LENGTH2);
		int length = sc.nextInt();
		if(start<toChangeChar.length) {
		for(int i = 0 ; i<start ; i++) {
			s += toChangeChar[i];
		}
		}
		if(start + length < toChangeChar.length)
		for(int j = start + length; j<toChangeChar.length;j++) {
			s2 += toChangeChar[j];
		}
		String s3 = s+s2;
		return s3;
		
	}
	
	public static String Split(String currentString) {
		/* For spliting the current string into an array of word
           Example - String text = "Codeup ACE Academy"
           String[] words = split(" "); // Result : ["Codeup", "ACE", "Academy"]
		 */
		
//		Scanner input = new Scanner(System.in);
//		Constant constant = new Constant();
//		System.out.println(constant.ENTER_INPUT);
//		String text = input.nextLine();
//		char[] words = text.toCharArray();
//		int n = words.length;
//		System.out.println("[");
//		for(char word : words) {
//			String str = "";
//			if(word != ' ') {
//				str = str + word;
//			}
//			System.out.print(str);
//			if(word == ' ') {
//				System.out.print(",");
//			}
//		}
//		
//		
		return null;
		
	}
	
	public static String MaxRepeatingCharacter(String currentString) {
		/*For finding and returning the characters of the current string in alphabetical order
	      Example - String text = "success";
          char maxChar = maxRepeat(); // Result : 's' -> 3
		  */
		
		int length = currentString.length();
		int count1 = 0;
		char spaceString = ' ';
		for(int i = 0; i < currentString.length(); i++) {
			int count2 = 0;
			spaceString = currentString.charAt(i);
			for(int j = i; j < length; j++) {
				if(spaceString == currentString.charAt(j)) {
					count2++;
				}
			}
			if(count2 > count1) {
				count1 = count2;
			}
		}
		
		String finalString = spaceString + " - > " + count1;
		
		return finalString;
		
	}
	
	/* For sorting the characters of the current string in alphabetical order		  
    Example - String text = "program"
    String sortedText = sort(); // Result : "agmnoprr"
	 */
	public static String Sort(String currentString) {
		

		char[] toChangeChar = currentString.toCharArray();
		for(int i = 0; i<toChangeChar.length - 1; i++ ) {
			for(int j = 0; j < toChangeChar.length - 1- i ;j++) {
				if(toChangeChar[j] > toChangeChar[j+1]) {
				char temp = toChangeChar[j];
				toChangeChar[j] = toChangeChar[j+1];
				toChangeChar[j+1] = temp;
				}
			}
		}
		return new String(toChangeChar);
		
	}
	
	/*For moving the first n characters from the start to the end of the current string 
    Example - String text = "abcdef";
    shift(2); // Result : efabcd;
    */
	public static String Shift(String currentString) {
		

		
		return null;
		
	}
	
	public static String Reverse(String currentString) {
		/*For reversing the current string
          Example - String text = "Java"
          String reversedText = reverse(); // Result : "avaJ" 
		 */
		char[] str1 = currentString.toCharArray();
		int inital = 0;
		int end = str1.length-1;
		while(inital<end) {
			char temp = str1[inital];
			str1[inital] = str1[end];
			str1[end] = temp;
			
			inital++;
			end--;
		}
		
		return new String(str1);
	}
	static String currentString;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Constant constant = new Constant();
		System.out.println(constant.ENTER_STRING);
	    currentString = sc.nextLine();
		while(true) {
			
		    System.out.println(constant.APPENDMETHOD);
		    System.out.println(constant.COUNTWORDMETHOD);
		    System.out.println(constant.REPLACEMETHOD);
		    System.out.println(constant.ISPALINDROMEMETHOD);
	     	System.out.println(constant.SPLICEMETHOD);
	     	System.out.println(constant.SPLITMETHOD);
     		System.out.println(constant.MAXREPEATINGCHARACTERMETHOD);
		    System.out.println(constant.SORTMETHOD);
	    	System.out.println(constant.SHIFTMETHOD);
		    System.out.println(constant.REVERSEMETHOD);
		    System.out.println(constant.ENTER_SAMPLE);
		    String method = sc.nextLine();
		    
		    switch(method) {
		        case "1" : System.out.println(Append(currentString));
		        break;
		        
		        case "2" : System.out.println(CountWord(currentString));
		        break;
		        
		        case "3" : System.out.println(Replace(currentString));
		        break;
		        
		        case "4" : System.out.println(isPalindrome(currentString));
		        break;
		        
		        case "5" : System.out.println(Splice(currentString));
		        break;
		        
		        case "6" : System.out.println(Split(currentString));
		        break;
		        
		        case "7" : System.out.println(MaxRepeatingCharacter(currentString));
		        break;
		        
		        case "8" : System.out.println(Sort(currentString));
		        break;
		        
		        case "9" : System.out.println(Shift(currentString));
		        break;
		        
		        case "10"  : System.out.println(Reverse(currentString));
		        break;
		        
		        default : System.out.println(constant.INVALID_INPUT);
		        
		    }
        }
	}

}
