/***
 * This is the Subtraction of Number System
 */

package conversion;

public class SubtractionOfConversion {
	
	/*
	 * This method is used for Substraction of Number System
	 */
	public static void sub(String[] inputArray, int inputNumberSystem, int inputParameter, int outputNumberSystem, int outputParameter) {
		String intputParameter = inputArray[inputNumberSystem];
		switch(intputParameter) {
			case "bin" : 
				subBinaryToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
				break;
			case "oct" : 
				subOctalToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
				break;
			case "dec" : 
				subDecimalToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
				break;
			case "hex" : 
				subHexaDecimalToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
		}
	}
	
	/*
	 * This method is used for substraction of Binary Number with other Number
	 */
	public static void subBinaryToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
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
			case "bin" :subBinaryToBinary(inputArray, outputParameter , firstInput);
				break;
			case "oct" : subBinaryToOctal(inputArray, outputParameter, firstInput);
				break;
			case "dec" : subBinaryToDecimal(inputArray, outputParameter, firstInput);
				break;
			case "hex" : subBinaryToHexaDecimal(inputArray, outputParameter, firstInput);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
			}
		}		
	}

	/*
	 * This method is used for substraction of Binary Number with Binary Number
	 */
	public static void subBinaryToBinary(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput - secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for substraction of Binary Number with Octal Number
	 */
	public static void subBinaryToOctal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput - secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for substraction of Binary Number with Decimal Number
	 */
	public static void subBinaryToDecimal(String[] inputArray, int outputParameter,  long firstInput) {
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
			long result = firstInput - secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for substraction of Binary Number with Hexa-Decimal Number
	 */
	public static void subBinaryToHexaDecimal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput - secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for substraction of Octal Number with other Number
	 */
	public static void subOctalToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
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
			case "bin" :subOctalToBinary(inputArray, outputParameter , firstInput);
				break;
			case "oct" : subOctalToOctal(inputArray, outputParameter, firstInput);
				break;
			case "dec" : subOctalToDecimal(inputArray, outputParameter, firstInput);
				break;
			case "hex" : subOctalToHexaDecimal(inputArray, outputParameter, firstInput);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
			}
		}
	}

	/*
	 * This method is used for substraction of Octal Number with Binary Number
	 */
	public static void subOctalToBinary(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput - secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for substraction of Octal Number with Octal Number
	 */
	public static void subOctalToOctal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput - secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for substraction of Octal Number with Decimal Number
	 */
	public static void subOctalToDecimal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput - secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for substraction of Octal Number with Hexa-Decimal Number
	 */
	public static void subOctalToHexaDecimal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput - secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for substraction of Decimal Number with other Number
	 */
	public static void subDecimalToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
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
				case "bin" :subDecimalToBinary(inputArray, outputParameter , number);
					break;
				case "oct" : subDecimalToOctal(inputArray, outputParameter, number);
					break;
				case "dec" : subDecimalToDecimal(inputArray, outputParameter, number);
					break;
				case "hex" : subDecimalToHexaDecimal(inputArray, outputParameter, number);
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
	 * This method is used for substraction of Decimal Number with Binary Number
	 */
	public static void subDecimalToBinary(String[] inputArray, int outputParameter, int number) {
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
			long result = number - secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for substraction of Decimal Number with Octal Number
	 */
	public static void subDecimalToOctal(String[] inputArray, int outputParameter, int number) {
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
			long result = number - secondInput;
			System.out.println(result);
		}		
	}

	/*
	 * This method is used for substraction of Decimal Number with Decimal Number
	 */
	public static void subDecimalToDecimal(String[] inputArray, int outputParameter, int number) {
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
			long result = number - secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for substraction of Decimal Number with hexa-Decimal Number
	 */
	public static void subDecimalToHexaDecimal(String[] inputArray, int outputParameter, int number) {
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
			long result = number - secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for substraction of Hexa-Decimal Number with other Number
	 */
	public static void subHexaDecimalToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
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
			case "bin" :subHexToBinary(inputArray, outputParameter , firstInput);
				break;
			case "oct" : subHexToOctal(inputArray, outputParameter, firstInput);
				break;
			case "dec" : subHexToDecimal(inputArray, outputParameter, firstInput);
				break;
			case "hex" : subHexToHexaDecimal(inputArray, outputParameter, firstInput);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
			}		
		}
	}

	/*
	 * This method is used for substraction of Hexa-Decimal Number with Binary Number
	 */
	public static void subHexToBinary(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput - secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for substraction of Hexa-Decimal Number with Octal Number
	 */
	public static void subHexToOctal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput - secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for substraction of Hexa-Decimal Number with Decimal Number
	 */
	public static void subHexToDecimal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput - secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for substraction of Hexa-Decimal Number with Hexa-Decimal Number
	 */
	public static void subHexToHexaDecimal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput - secondInput;
			System.out.println(result);		
		}
	}
}
