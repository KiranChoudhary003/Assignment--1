/***
 * This is the Division of Number System
 */		

package conversion;

public class DivisionOfConversion {
	/*
	 * This method is used for Division of Number System
	 */
	public static void divide(String[] inputArray, int inputNumberSystem, int inputParameter, int outputNumberSystem, int outputParameter) {
		String intputParameter = inputArray[inputNumberSystem];
		switch(intputParameter) {
		case "bin" : 
			divideBinaryToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
			break;
		case "oct" : 
			divideOctalToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
			break;
		case "dec" : 
			divideDecimalToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
			break;
		case "hex" : 
			divideHexaDecimalToOther(inputArray, inputParameter, outputNumberSystem, outputParameter);
			break;
		default :
			System.out.println(Constant.INVALID_STRING);
			break;
		}
	}
	
	/*
	 * This method is used for Division of Binary Number with other Number
	 */
	public static void divideBinaryToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
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
				case "bin" : divideBinaryToBinary(inputArray, outputParameter , firstInput);
					break;
				case "oct" : divideBinaryToOctal(inputArray, outputParameter, firstInput);
					break;
				case "dec" : divideBinaryToDecimal(inputArray, outputParameter, firstInput);
					break;
				case "hex" : divideBinaryToHexaDecimal(inputArray, outputParameter, firstInput);
					break;
				default :
					System.out.println(Constant.INVALID_STRING);
					break;
			}
		}		
	}

	/*
	 * This method is used for Division of Binary Number with Binary Number
	 */
	public static void divideBinaryToBinary(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput / secondInput;
			System.out.println(result);
		}
	}
	
	/*
	 * This method is used for Division of Binary Number with Octal Number
	 */
	public static void divideBinaryToOctal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput / secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for Division of Binary Number with Decimal Number
	 */
	public static void divideBinaryToDecimal(String[] inputArray, int outputParameter,  long firstInput) {
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
			long result = firstInput / secondInput;
			System.out.println(result);		
		}
	}
	
	/*
	 * This method is used for Division of Binary Number with Hexa-Decimal Number
	 */
	public static void divideBinaryToHexaDecimal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput / secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for Division of Octal Number with other Number
	 */
	public static void divideOctalToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
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
			case "bin" : divideOctalToBinary(inputArray, outputParameter , firstInput);
				break;
			case "oct" : divideOctalToOctal(inputArray, outputParameter, firstInput);
				break;
			case "dec" : divideOctalToDecimal(inputArray, outputParameter, firstInput);
				break;
			case "hex" : divideOctalToHexaDecimal(inputArray, outputParameter, firstInput);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
			}
		}
	}

	/*
	 * This method is used for Division of Octal Number with Binary Number
	 */
	public static void divideOctalToBinary(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput / secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for Division of Octal Number with Octal Number
	 */
	public static void divideOctalToOctal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput / secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for Division of Octal Number with Decimal Number
	 */
	public static void divideOctalToDecimal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput / secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for Division of Octal Number with Hexa-Decimal Number
	 */
	public static void divideOctalToHexaDecimal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput / secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for Division of Decimal Number with other Number
	 */
	public static void divideDecimalToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
		try {
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
				case "bin" : divideDecimalToBinary(inputArray, outputParameter , number);
					break;
				case "oct" : divideDecimalToOctal(inputArray, outputParameter, number);
					break;
				case "dec" : divideDecimalToDecimal(inputArray, outputParameter, number);
					break;
				case "hex" : divideDecimalToHexaDecimal(inputArray, outputParameter, number);
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
	 * This method is used for Division of Decimal Number with Binary Number
	 */
	public static void divideDecimalToBinary(String[] inputArray, int outputParameter, int number) {
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
			long result = number / secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for Division of Decimal Number with Octal Number
	 */
	public static void divideDecimalToOctal(String[] inputArray, int outputParameter, int number) {
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
			long result = number / secondInput;
			System.out.println(result);
		}		
	}

	/*
	 * This method is used for Division of Decimal Number with Decimal Number
	 */
	public static void divideDecimalToDecimal(String[] inputArray, int outputParameter, int number) {
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
			long result = number / secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for Division of Decimal Number with hexa-Decimal Number
	 */
	public static void divideDecimalToHexaDecimal(String[] inputArray, int outputParameter, int number) {
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
			long result = number / secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for Division of Hexa-Decimal Number with other Number
	 */
	public static void divideHexaDecimalToOther(String[] inputArray, int inputParameter, int outputNumberSystem, int outputParameter) {
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
			long firstInput = ConversionOfNumberSystem.octalToDecimal(inputArray, inputParameter);
			String output = inputArray[outputNumberSystem];
			switch(output) {
			case "bin" : divideHexToBinary(inputArray, outputParameter , firstInput);
				break;
			case "oct" : divideHexToOctal(inputArray, outputParameter, firstInput);
				break;
			case "dec" : divideHexToDecimal(inputArray, outputParameter, firstInput);
				break;
			case "hex" : divideHexToHexaDecimal(inputArray, outputParameter, firstInput);
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
	public static void divideHexToBinary(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput / secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for Division of Hexa-Decimal Number with Octal Number
	 */
	public static void divideHexToOctal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput / secondInput;
			System.out.println(result);
		}
	}

	/*
	 * This method is used for Division of Hexa-Decimal Number with Decimal Number
	 */
	public static void divideHexToDecimal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput / secondInput;
			System.out.println(result);		
		}
	}

	/*
	 * This method is used for Division of Hexa-Decimal Number with Hexa-Decimal Number
	 */
	public static void divideHexToHexaDecimal(String[] inputArray, int outputParameter, long firstInput) {
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
			long result = firstInput / secondInput;
			System.out.println(result);		
		}
	}
}

