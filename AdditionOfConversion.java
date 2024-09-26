/***
 * This is the Addition of Number System
 */

package conversion;

public class AdditionOfConversion {
	
	/*
	 * This method is used to add the Number System
	 */
	public static void add(String[] inputArray, int inputNumberSystem, int inputParameter, int outputNumberSystem, int outputParameter) {
		String intputParameter = inputArray[inputNumberSystem];
		switch(intputParameter) {
			case "bin" : 
				addBinaryToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
				break;
			case "oct" : 
				addOctalToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
				break;
			case "dec" : 
				addDecimalToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
				break;
			case "hex" : 
				addHexaDecimalToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
		}
	}
	
	/*
	 * This method is used for add the Binary Number with other Number
	 */
	public static void addBinaryToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
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
			case "bin" :addBinaryToBinary(inputArray, outputParameter , firstInput);
				break;
			case "oct" : addBinaryToOctal(inputArray, outputParameter, firstInput);
				break;
			case "dec" : addBinaryToDecimal(inputArray, outputParameter, firstInput);
			break;
			case "hex" : addBinaryToHexaDecimal(inputArray, outputParameter, firstInput);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
			}
		}		
	}

	/*
	 * This method is used for add the Binary Number with Binary Number
	 */
	public static void addBinaryToBinary(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput + secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for add the Binary Number with Octal Number
	 */
	public static void addBinaryToOctal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString1 = inputArray[outputParameter];
		boolean isValidOctal = true;
		for (int i = 0; i < inputString1.length(); i++) {
			char changeTocharacter = inputString1.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '7') {
				isValidOctal = false;
				break;
			}
		}
		if(!isValidOctal) {
			System.out.println(Constant.NOT_OCTAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput + secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for add the Binary Number with Decimal Number
	 */
	public static void addBinaryToDecimal(String[] inputArray, int outputParameter,  long firstInput) {
		String inputString2 = inputArray[outputParameter];
		boolean isValidDecimal = true;
		for (int i = 0; i < inputString2.length(); i++) {
			char changeTocharacter = inputString2.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '9') {
				isValidDecimal = false;
				break;
			}
		}
		if(!isValidDecimal) {
			System.out.println(Constant.NOT_DECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput + secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for add the Binary Number with Hexa-Decimal Number
	 */
	public static void addBinaryToHexaDecimal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString3 = inputArray[outputParameter];
		boolean isValidHexaDecimal = true;
		for (int i = 0; i < inputString3.length(); i++) {
			char changeTocharacter = inputString3.charAt(i);
			if(!((changeTocharacter >= '0' && changeTocharacter <= '9') || (changeTocharacter >= 'A' && changeTocharacter <= 'F') || (changeTocharacter >= 'a' && changeTocharacter <= 'f'))) {
				isValidHexaDecimal = false;
				break;
			}
		}
		if(!isValidHexaDecimal) {
			System.out.println(Constant.NOT_HEXADECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput + secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for add the Octal Number with other Number
	 */
	public static void addOctalToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
		String inputString1 = inputArray[inputParameter];
		boolean isValidOctal = true;
		for (int i = 0; i < inputString1.length(); i++) {
			char changeTocharacter = inputString1.charAt(i);
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
			case "bin" :addOctalToBinary(inputArray, outputParameter , firstInput);
				break;
			case "oct" : addOctalToOctal(inputArray, outputParameter, firstInput);
				break;
			case "dec" : addOctalToDecimal(inputArray, outputParameter, firstInput);
				break;
			case "hex" : addOctalToHexaDecimal(inputArray, outputParameter, firstInput);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
			}
		}
	}

	/*
	 * This method is used for add the Octal Number with Binary Number
	 */
	public static void addOctalToBinary(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput + secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for add the Octal Number with Octal Number
	 */
	public static void addOctalToOctal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString1 = inputArray[outputParameter];
		boolean isValidOctal = true;
		for (int i = 0; i < inputString1.length(); i++) {
			char changeTocharacter = inputString1.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '7') {
				isValidOctal = false;
				break;
			}
		}
		if(!isValidOctal) {
			System.out.println(Constant.NOT_OCTAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput + secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for add the Octal Number with Decimal Number
	 */
	public static void addOctalToDecimal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString2 = inputArray[outputParameter];
		boolean isValidDecimal = true;
		for (int i = 0; i < inputString2.length(); i++) {
			char changeTocharacter = inputString2.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '9') {
				isValidDecimal = false;
				break;
			}
		}
		if(!isValidDecimal) {
			System.out.println(Constant.NOT_DECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput + secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for add the Octal Number with Hexa-Decimal Number
	 */
	public static void addOctalToHexaDecimal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString3 = inputArray[outputParameter];
		boolean isValidHexaDecimal = true;
		for (int i = 0; i < inputString3.length(); i++) {
			char changeTocharacter = inputString3.charAt(i);
			if(!((changeTocharacter >= '0' && changeTocharacter <= '9') || (changeTocharacter >= 'A' && changeTocharacter <= 'F') || (changeTocharacter >= 'a' && changeTocharacter <= 'f'))) {
				isValidHexaDecimal = false;
				break;
			}
		}
		if(!isValidHexaDecimal) {
			System.out.println(Constant.NOT_HEXADECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput + secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for add the Decimal Number with other Number
	 */
	public static void addDecimalToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
		String inputString2 = inputArray[inputParameter];
		boolean isValidDecimal = true;
		for (int i = 0; i < inputString2.length(); i++) {
			char changeTocharacter = inputString2.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '9') {
				isValidDecimal = false;
				break;
			}
		}
		if(!isValidDecimal) {
			System.out.println(Constant.NOT_DECIMAL);
		}else {
			int number = Integer.parseInt(inputString2);
			String output = inputArray[outputNumberSystem];
			switch(output) {
			case "bin" :addDecimalToBinary(inputArray, outputParameter , number);
				break;
			case "oct" : addDecimalToOctal(inputArray, outputParameter, number);
				break;
			case "dec" : addDecimalToDecimal(inputArray, outputParameter, number);
				break;
			case "hex" : addDecimalToHexaDecimal(inputArray, outputParameter, number);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
			}
		}
	}

	/*
	 * This method is used for add the Decimal Number with Binary Number
	 */
	public static void addDecimalToBinary(String[] inputArray, int outputParameter,	int number) {
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
			long result = number + secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for add the Decimal Number with Octal Number
	 */
	public static void addDecimalToOctal(String[] inputArray, int outputParameter, int number) {
		String inputString1 = inputArray[outputParameter];
		boolean isValidOctal = true;
		for (int i = 0; i < inputString1.length(); i++) {
			char changeTocharacter = inputString1.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '7') {
				isValidOctal = false;
				break;
			}
		}
		if(!isValidOctal) {
			System.out.println(Constant.NOT_OCTAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = number + secondInput;
			System.out.println(result);
		}		
	}

	/*
	 * This method is used for add the Decimal Number with Decimal Number
	 */
	public static void addDecimalToDecimal(String[] inputArray, int outputParameter, int number) {
		String inputString2 = inputArray[outputParameter];
		boolean isValidDecimal = true;
		for (int i = 0; i < inputString2.length(); i++) {
			char changeTocharacter = inputString2.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '9') {
				isValidDecimal = false;
				break;
			}
		}
		if(!isValidDecimal) {
			System.out.println(Constant.NOT_DECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = number + secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for add the Decimal Number with Hexa-Decimal Number
	 */
	public static void addDecimalToHexaDecimal(String[] inputArray, int outputParameter, int number) {
		String inputString3 = inputArray[outputParameter];
		boolean isValidHexaDecimal = true;
		for (int i = 0; i < inputString3.length(); i++) {
			char changeTocharacter = inputString3.charAt(i);
			if(!((changeTocharacter >= '0' && changeTocharacter <= '9') || (changeTocharacter >= 'A' && changeTocharacter <= 'F') || (changeTocharacter >= 'a' && changeTocharacter <= 'f'))) {
				isValidHexaDecimal = false;
				break;
			}
		}
		if(!isValidHexaDecimal) {
			System.out.println(Constant.NOT_HEXADECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = number + secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for add the Hexa-Decimal Number with other Number
	 */
	public static void addHexaDecimalToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
		String inputString3 = inputArray[inputParameter];
		boolean isValidHexaDecimal = true;
		for (int i = 0; i < inputString3.length(); i++) {
			char changeTocharacter = inputString3.charAt(i);
			if(!((changeTocharacter >= '0' && changeTocharacter <= '9') || (changeTocharacter >= 'A' && changeTocharacter <= 'F') || (changeTocharacter >= 'a' && changeTocharacter <= 'f'))) {
				isValidHexaDecimal = false;
				break;
			}
		}
		if(!isValidHexaDecimal) {
			System.out.println(Constant.NOT_HEXADECIMAL);
		}else {
			long firstInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			String output = inputArray[outputNumberSystem];
			switch(output) {
			case "bin" :addHexToBinary(inputArray, outputParameter , firstInput);
				break;
			case "oct" : addHexToOctal(inputArray, outputParameter, firstInput);
				break;
			case "dec" : addHexToDecimal(inputArray, outputParameter, firstInput);
				break;
			case "hex" : addHexToHexaDecimal(inputArray, outputParameter, firstInput);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
			}		
		}
	}

	/*
	 * This method is used for add the Hexa-Decimal Number with Binary Number
	 */
	public static void addHexToBinary(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput + secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for add the Hexa-Decimal Number with Octal Number
	 */
	public static void addHexToOctal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString1 = inputArray[outputParameter];
		boolean isValidOctal = true;
		for (int i = 0; i < inputString1.length(); i++) {
			char changeTocharacter = inputString1.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '7') {
				isValidOctal = false;
				break;
			}
		}
		if(!isValidOctal) {
			System.out.println(Constant.NOT_OCTAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput + secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for add the Hexa-Decimal Number with Decimal Number
	 */
	public static void addHexToDecimal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString2 = inputArray[outputParameter];
		boolean isValidDecimal = true;
		for (int i = 0; i < inputString2.length(); i++) {
			char changeTocharacter = inputString2.charAt(i);
			if (changeTocharacter < '0' || changeTocharacter > '9') {
				isValidDecimal = false;
				break;
			}
		}
		if(!isValidDecimal) {
			System.out.println(Constant.NOT_DECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput + secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for add the Hexa-Decimal Number with Hexa-Decimal Number
	 */
	public static void addHexToHexaDecimal(String[] inputArray, int outputParameter, long firstInput) {
		String inputString3 = inputArray[outputParameter];
		boolean isValidHexaDecimal = true;
		for (int i = 0; i < inputString3.length(); i++) {
			char changeTocharacter = inputString3.charAt(i);
			if(!((changeTocharacter >= '0' && changeTocharacter <= '9') || (changeTocharacter >= 'A' && changeTocharacter <= 'F') || (changeTocharacter >= 'a' && changeTocharacter <= 'f'))) {
				isValidHexaDecimal = false;
				break;
			}
		}
		if(!isValidHexaDecimal) {
			System.out.println(Constant.NOT_HEXADECIMAL);
		}else {
			long secondInput = ConversionOfNumberSystem.octalToDecimal(inputArray, outputParameter);
			long result = firstInput + secondInput;
			System.out.println(result);		
		}
	}
}
