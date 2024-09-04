/***
 * Following operation are performed :
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
	
	public static String Append() {
		
		Scanner append = new Scanner(System.in);
		Constant constant = new Constant();
	    System.out.println(constant.ENTER_STRING);
		String str = append.next();
		return str;
	}
	
	public static int CountWord() {
		return 0;
		
	}
	
	public static String Replace() {
		return null;
	
	}
	
	public static boolean isPalindrome() {
		Scanner ispalindrome = new Scanner(System.in);
		Constant constant = new Constant();
		System.out.println(constant.ENTER_STRING);
		String str = ispalindrome.next();
		char[] str1 = str.toCharArray();
		char[] str2 = str.toCharArray();
		int a = 0 ;
		int b = str1.length -1;
		while(a<b) {
			char temp = str1[a];
			str1[a] = str1[b];
			str1[b] = temp;
			if(Arrays.equals(str1, str2)) {
				return true;
			}else {
				return false;
			}
	
		}
		return true;
	}
	
	public static String Splice() {
		return null;
		
	}
	
	public static String Split() {
		return null;
		
	}
	
	public static String MaxRepeatingCharacter() {
		return null;
		
	}
	
	public static String Sort() {
		return null;
		
	}
	
	public static String Shift() {
		return null;
		
	}
	
	public static String Reverse() {
		Scanner sc = new Scanner(System.in);
		Constant constant = new Constant();
		System.out.println(constant.ENTER_STRING);
		String reverse = sc.next();
		
		
		char[] str = reverse.toCharArray();
		int a = 0;
		int b = str.length-1;
		while(a<b) {
			char temp = str[a];
			str[a] = str[b];
			str[b] = temp;
			
			a++;
			b--;
		}
		
		return new String(str);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Constant constant = new Constant();
		
		while(true) {
		    System.out.println(constant.ENTER1);
		    System.out.println(constant.ENTER2);
		    System.out.println(constant.ENTER3);
		    System.out.println(constant.ENTER4);
	     	System.out.println(constant.ENTER5);
	     	System.out.println(constant.ENTER6);
     		System.out.println(constant.ENTER7);
		    System.out.println(constant.ENTER8);
	    	System.out.println(constant.ENTER9);
		    System.out.println(constant.ENTER10);
		    System.out.println(constant.ENTER_SAMPLE);
		    System.out.println(constant.ENTER_INPUT);
		    int method = sc.nextInt();
		    
		    switch(method) {
		        case 1 : System.out.println(Append());
		        break;
		        
		        case 2 : System.out.println(CountWord());
		        break;
		        
		        case 3 : System.out.println(Replace());
		        break;
		        
		        case 4 : System.out.println(isPalindrome());
		        break;
		        
		        case 5 : System.out.println(Splice());
		        break;
		        
		        case 6 : System.out.println(Split());
		        break;
		        
		        case 7 : System.out.println(MaxRepeatingCharacter());
		        break;
		        
		        case 8 : System.out.println(Sort());
		        break;
		        
		        case 9 : System.out.println(Shift());
		        break;
		        
		        case 10  : System.out.println(Reverse());
		        break;
		        
		    }
        }
	}

}
