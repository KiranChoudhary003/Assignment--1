/***
 * This is the Multiplication of Number System
 */

package conversion;

public class MultiplicationOfConversion {
	
	/*
	 * This method is used for Multiplication of Number System
	 */
	public static void multiply(String[] inputArray, int inputNumberSystem, int inputParameter, int outputNumberSystem, int outputParameter) {
		String intputParameter = inputArray[inputNumberSystem];
		switch(intputParameter) {
		case "bin" : 
			multiplyBinaryToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
			break;
		case "oct" : 
			multiplyOctalToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
			break;
		case "dec" : 
			multiplyDecimalToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
			break;
		case "hex" : 
			multiplyHexaDecimalToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
			break;
		default :
			System.out.println(Constant.INVALID_STRING);
			break;
		}
	}
	
	/*
	 * This method is used for Multiplication of Binary Number with other Number
	 */
	public static void multiplyBinaryToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
		String inputString = inputArray[inputParameter];
		boolean isValidBinary = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter != '0' && changeTocharacter != '1') {
				isValidBinary = false;
				break;
			}
		}
		if(!isValidBinary) {
			System.out.println(Constant.NOT_BINARY);
		}else {
			long firstInput = ConversionOfNumberSystem.binaryToDecimal(inputArray, inputParameter);
			String output = inputArray[outputNumberSystem];
			switch(output) {
				case "bin" :multiplyBinaryToBinary(inputArray, outputParameter , firstInput);
					break;
				case "oct" : multiplyBinaryToOctal(inputArray, outputParameter, firstInput);
					break;
				case "dec" : multiplyBinaryToDecimal(inputArray, outputParameter, firstInput);
					break;
				case "hex" : multiplyBinaryToHexaDecimal(inputArray, outputParameter, firstInput);
					break;
				default :
					System.out.println(Constant.INVALID_STRING);
					break;
			}
		}		
	}

	/*
	 * This method is used for Multiplication of Binary Number with Binary Number
	 */
	public static void multiplyBinaryToBinary(String[] inputArray, int outputParameter, long firstInput) {
		String inputString = inputArray[outputParameter];
		boolean isValidBinary = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter != '0' && changeTocharacter != '1') {
				isValidBinary = false;
				break;
			}
		}
		if(!isValidBinary) {
			System.out.println(Constant.NOT_BINARY);
		}else {
			long secondInput = ConversionOfNumberSystem.binaryToDecimal(inputArray, outputParameter);
			long result = firstInput * secondInput;
			System.out.println(result);
		}
	}
	
	/*
	 * This method is used for Multiplication of Binary Number with Octal Number
	 */
	public static void multiplyBinaryToOctal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString = inputArray[outputParameter];
		boolean isValidOctal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '7') {
				isValidOctal = false;
				break;
			}
		}
		if(!isValidOctal) {
			System.out.println(Constant.NOT_OCTAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput * secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for Multiplication of Binary Number with Decimal Number
	 */
	public static void multiplyBinaryToDecimal(String[] inputArray, int outputParameter,  long firstInput) {
		String inputString = inputArray[outputParameter];
		boolean isValidDecimal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '9') {
				isValidDecimal = false;
				break;
			}
		}
		if(!isValidDecimal) {
			System.out.println(Constant.NOT_DECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput * secondInput;
			System.out.println(result);		
		}
	}
	
	/*
	 * This method is used for Multiplication of Binary Number with Hexa-Decimal Number
	 */
	public static void multiplyBinaryToHexaDecimal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString = inputArray[outputParameter];
		boolean isValidHexaDecimal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if(!((changeTocharacter >= '0' && changeTocharacter <= '9') || (changeTocharacter >= 'A' && changeTocharacter <= 'F') || (changeTocharacter >= 'a' && changeTocharacter <= 'f'))) {
				isValidHexaDecimal = false;
				break;
			}
		}
		if(!isValidHexaDecimal) {
			System.out.println(Constant.NOT_HEXADECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput * secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for Multiplication of Octal Number with other Number
	 */
	public static void multiplyOctalToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
		String inputString = inputArray[inputParameter];
		boolean isValidOctal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '7') {
				isValidOctal = false;
					break;
			}
		}
		if(!isValidOctal) {
			System.out.println(Constant.NOT_OCTAL);
		}else {
			long firstInput = ConversionOfNumberSystem.octalToDecimal(inputArray, inputParameter);
			String output = inputArray[outputNumberSystem];
			switch(output) {
			case "bin" : multiplyOctalToBinary(inputArray, outputParameter , firstInput);
				break;
			case "oct" : multiplyOctalToOctal(inputArray, outputParameter, firstInput);
				break;
			case "dec" : multiplyOctalToDecimal(inputArray, outputParameter, firstInput);
				break;
			case "hex" : multiplyOctalToHexaDecimal(inputArray, outputParameter, firstInput);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
			}
		}
	}

	/*
	 * This method is used for Multiplication of Octal Number with Binary Number
	 */
	public static void multiplyOctalToBinary(String[] inputArray, int outputParameter, long firstInput) {
		String inputString = inputArray[outputParameter];
		boolean isValidBinary = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter != '0' && changeTocharacter != '1') {
				isValidBinary = false;
				break;
			}
		}
		if(!isValidBinary) {
			System.out.println(Constant.NOT_BINARY);
		}else {
			long secondInput = ConversionOfNumberSystem.binaryToDecimal(inputArray, outputParameter);
			long result = firstInput * secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for Multiplication of Octal Number with Octal Number
	 */
	public static void multiplyOctalToOctal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString = inputArray[outputParameter];
		boolean isValidOctal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '7') {
				isValidOctal = false;
				break;
			}
		}
		if(!isValidOctal) {
			System.out.println(Constant.NOT_OCTAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput * secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for Multiplication of Octal Number with Decimal Number
	 */
	public static void multiplyOctalToDecimal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString = inputArray[outputParameter];
		boolean isValidDecimal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '9') {
				isValidDecimal = false;
				break;
			}
		}
		if(!isValidDecimal) {
			System.out.println(Constant.NOT_DECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput * secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for Multiplication of Octal Number with Hexa-Decimal Number
	 */
	public static void multiplyOctalToHexaDecimal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString = inputArray[outputParameter];
		boolean isValidHexaDecimal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if(!((changeTocharacter >= '0' && changeTocharacter <= '9') || (changeTocharacter >= 'A' && changeTocharacter <= 'F') || (changeTocharacter >= 'a' && changeTocharacter <= 'f'))) {
				isValidHexaDecimal = false;
				break;
			}
		}
		if(!isValidHexaDecimal) {
			System.out.println(Constant.NOT_HEXADECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput * secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for Multiplication of Decimal Number with other Number
	 */
	public static void multiplyDecimalToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
		try {
			String inputString = inputArray[inputParameter];
			boolean isValidDecimal = true;
			for (int i = 0; i < inputString.length(); i++) {
				char changeTocharacter = inputString.charAt(i);
				if (changeTocharacter < '0' || changeTocharacter > '9') {
					isValidDecimal = false;
					break;
				}
			}
			if(!isValidDecimal) {
				System.out.println(Constant.NOT_DECIMAL);
			}else {
				int number = Integer.parseInt(inputString);
				String output = inputArray[outputNumberSystem];
				switch(output) {
				case "bin" : multiplyDecimalToBinary(inputArray, outputParameter , number);
					break;
				case "oct" : multiplyDecimalToOctal(inputArray, outputParameter, number);
					break;
				case "dec" : multiplyDecimalToDecimal(inputArray, outputParameter, number);
					break;
				case "hex" : multiplyDecimalToHexaDecimal(inputArray, outputParameter, number);
					break;
				default :
					System.out.println(Constant.INVALID_STRING);
					break;
				}
			}
		} catch(Exception e) {
			System.out.println(Constant.INVALID_STRING);
		}
	}

	/*
	 * This method is used for Multiplication of Decimal Number with Binary Number
	 */
	public static void multiplyDecimalToBinary(String[] inputArray, int outputParameter, int number) {
		String inputString = inputArray[outputParameter];
		boolean isValidBinary = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter != '0' && changeTocharacter != '1') {
				isValidBinary = false;
				break;
			}
		}
		if(!isValidBinary) {
			System.out.println(Constant.NOT_BINARY);
		}else {
			long secondInput = ConversionOfNumberSystem.binaryToDecimal(inputArray, outputParameter);
			long result = number * secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for Multiplication of Decimal Number with Octal Number
	 */
	public static void multiplyDecimalToOctal(String[] inputArray, int outputParameter, int number) {
		String inputString = inputArray[outputParameter];
		boolean isValidOctal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '7') {
				isValidOctal = false;
				break;
			}
		}
		if(!isValidOctal) {
			System.out.println(Constant.NOT_OCTAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = number * secondInput;
			System.out.println(result);
		}		
	}

	/*
	 * This method is used for Multiplication of Decimal Number with Decimal Number
	 */
	public static void multiplyDecimalToDecimal(String[] inputArray, int outputParameter, int number) {
		String inputString = inputArray[outputParameter];
		boolean isValidDecimal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '9') {
				isValidDecimal = false;
				break;
			}
		}
		if(!isValidDecimal) {
			System.out.println(Constant.NOT_DECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = number * secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for Multiplication of Decimal Number with hexa-Decimal Number
	 */
	public static void multiplyDecimalToHexaDecimal(String[] inputArray, int outputParameter, int number) {
		String inputString = inputArray[outputParameter];
		boolean isValidHexaDecimal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if(!((changeTocharacter >= '0' && changeTocharacter <= '9') || (changeTocharacter >= 'A' && changeTocharacter <= 'F') || (changeTocharacter >= 'a' && changeTocharacter <= 'f'))) {
				isValidHexaDecimal = false;
				break;
			}
		}
		if(!isValidHexaDecimal) {
			System.out.println(Constant.NOT_HEXADECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = number * secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for Multiplication of Hexa-Decimal Number with other Number
	 */
	public static void multiplyHexaDecimalToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
		String inputString = inputArray[inputParameter];
		boolean isValidHexaDecimal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if(!((changeTocharacter >= '0' && changeTocharacter <= '9') || (changeTocharacter >= 'A' && changeTocharacter <= 'F') || (changeTocharacter >= 'a' && changeTocharacter <= 'f'))) {
				isValidHexaDecimal = false;
				break;
			}
		}
		if(!isValidHexaDecimal) {
			System.out.println(Constant.NOT_HEXADECIMAL);
		}else {
			long firstInput = ConversionOfNumberSystem.octalToDecimal(inputArray, inputParameter);
			String output = inputArray[outputNumberSystem];
			switch(output) {
			case "bin" : multiplyHexToBinary(inputArray, outputParameter , firstInput);
				break;
			case "oct" : multiplyHexToOctal(inputArray, outputParameter, firstInput);
				break;
			case "dec" : multiplyHexToDecimal(inputArray, outputParameter, firstInput);
				break;
			case "hex" : multiplyHexToHexaDecimal(inputArray, outputParameter, firstInput);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
			}		
		}
	}

	/*
	 * This method is used for Multiplication of Hexa-Decimal Number with Binary Number
	 */
	public static void multiplyHexToBinary(String[] inputArray, int outputParameter, long firstInput) {
		String inputString = inputArray[outputParameter];
		boolean isValidBinary = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter != '0' && changeTocharacter != '1') {
				isValidBinary = false;
				break;
			}
		}
		if(!isValidBinary) {
			System.out.println(Constant.NOT_BINARY);
		}else {
			long secondInput = ConversionOfNumberSystem.binaryToDecimal(inputArray, outputParameter);
			long result = firstInput * secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for Multiplication of Hexa-Decimal Number with Octal Number
	 */
	public static void multiplyHexToOctal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString = inputArray[outputParameter];
		boolean isValidOctal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '7') {
				isValidOctal = false;
				break;
			}
		}	
		if(!isValidOctal) {
			System.out.println(Constant.NOT_OCTAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput * secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for Multiplication of Hexa-Decimal Number with Decimal Number
	 */
	public static void multiplyHexToDecimal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString = inputArray[outputParameter];
		boolean isValidDecimal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '9') {
				isValidDecimal = false;
				break;
			}
		}
		if(!isValidDecimal) {
			System.out.println(Constant.NOT_DECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput * secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for Multiplication of Hexa-Decimal Number with Hexa-Decimal Number
	 */
	public static void multiplyHexToHexaDecimal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString = inputArray[outputParameter];
		boolean isValidHexaDecimal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char changeTocharacter = inputString.charAt(i);
			if(!((changeTocharacter >= '0' && changeTocharacter <= '9') || (changeTocharacter >= 'A' && changeTocharacter <= 'F') || (changeTocharacter >= 'a' && changeTocharacter <= 'f'))) {
				isValidHexaDecimal = false;
				break;
			}
		}
		if(!isValidHexaDecimal) {
			System.out.println(Constant.NOT_HEXADECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput * secondInput;
			System.out.println(result);		
		}
	}
}

