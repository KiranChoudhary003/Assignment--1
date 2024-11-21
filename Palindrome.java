package dsaAssigment;

import java.util.Scanner;

public class Palindrome {
    
    static int count = 0; 
    
    public static void combination(String inputString, int start, String combination) {
    	if (start == inputString.length()) {
            return;
        }

        for (int i = start; i < inputString.length(); i++) {
            String newCombination = combination + inputString.charAt(i);

            if (isPalindrome(newCombination, 0, newCombination.length() - 1)) {
                count++; 
                System.out.println(Constant.PALINDROME + newCombination);
            }

            combination(inputString, i + 1, newCombination);
        }
    }

    public static boolean isPalindrome(String string, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (string.charAt(left) != string.charAt(right)) {
            return false;
        }
        return isPalindrome(string, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char repeatTask = ' ';
        
        do {
        	System.out.println(Constant.ENTER_STRING);
        	String inputString = input.nextLine();

        	combination(inputString, 0, "");

        	System.out.println(Constant.COUNT_STRING + count);
        	
        	System.out.println(Constant.REPEAT_TASK);
        	repeatTask = input.next().charAt(0);
        	input.nextLine();
        }while(repeatTask == 'Y' || repeatTask == 'y');
        System.out.println(Constant.PROGRAM_END);
    }
}
