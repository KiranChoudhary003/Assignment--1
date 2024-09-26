/***
 * In this we are taking String from user for conversion of Number System and for addition and subtraction of conversion.
 * Created By - Kiran Choudhary
 * Date - 26 September 2024
 */

package conversion;

import java.util.Scanner;

/*
 * It's a Base Class
 */
public class NumberConversion {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Constant constant = new Constant();
        String inputString = constant.EMPTY_STRING;
        while(true) {
		System.out.println(constant.EXAMPLE);
		System.out.println(constant.ENTER_STRING);
		inputString = input.nextLine();
		if (inputString.equalsIgnoreCase(constant.EXIT)) {
            System.out.println(constant.EXITING_PROGRAM);
            break;
        }
		String[] array = new String[100];
		String emptyString = "";
		int index = 0;
		for(int i = 0 ; i < inputString.length() ; i++) {
			char character = inputString.charAt(i);
			if(character != ' ') {
				emptyString = emptyString + character;
				continue;
			} else {
				array[index] = emptyString;
				index++;
				emptyString = constant.EMPTY_STRING;
			}
		}
		if (!emptyString.isEmpty()) {
			array[index] = emptyString;
            index++;
        }
		switch (array[0]) {
	    case "convert":
	        int inputNumberSystem = 1,inputParameter = 2, outputNumberSystem = 4;
	        ConversionOfNumberSystem.convert(array, inputNumberSystem, inputParameter, outputNumberSystem);
	        break; 
	    case "add":
	    	inputNumberSystem = 1; inputParameter = 2; outputNumberSystem = 4;
	        int outputParameter = 5;
	        AdditionOfConversion.add(array, inputNumberSystem, inputParameter, outputNumberSystem, outputParameter);
	        break;       
	    case "sub":
	    	inputNumberSystem = 1; inputParameter = 2; outputNumberSystem = 4; outputParameter = 5;
	        SubtractionOfConversion.sub(array, inputNumberSystem, inputParameter, outputNumberSystem, outputParameter);
	        break;   
	    default:
	        System.out.println(constant.INVALID_STRING);
	        break;
		}
        } 
        input.close();
	}
}
