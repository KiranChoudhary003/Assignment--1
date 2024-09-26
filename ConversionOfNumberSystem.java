package conversion;

public class ConversionOfNumberSystem {
	
	public static void convert(String[] inputArray, int inputNumberSystem, int inputParameter,int outputNumberSystem) {
		String outputParameter = inputArray[inputNumberSystem];
	    String inputNumber = inputArray[inputParameter];
		switch(outputParameter) {
			case "bin" : binaryToOther(inputArray, inputParameter, outputNumberSystem);
				break;
			case "oct" : octalToOther(inputArray, inputParameter, outputNumberSystem);
				break;
			case "dec" : decimalToOther(inputArray, inputParameter, outputNumberSystem);
				break;
			case "hex" : hexaDecimalToOther(inputArray, inputParameter, outputNumberSystem);
				break;
			default :
				System.out.println(Constant.INVALID_STRING);
				break;
		}
	}
	
	public static void binaryToOther(String[] inputArray, int inputParameter, int outputNumberSystem) {
		String inputString = inputArray[inputParameter];
		boolean isValidBinary = true;
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (ch != '0' && ch != '1') {
				isValidBinary = false;
				break;
		    }
		}
		if(!isValidBinary) {
			System.out.println(Constant.NOT_BINARY);
		}else {
			String outputParameter = inputArray[outputNumberSystem];
			switch(outputParameter) {
				case "bin" : System.out.println(inputString);
					break;
				case "oct" : binaryToOctal(inputArray, inputParameter);
					break;
				case "dec" : System.out.println(binaryToDecimal(inputArray, inputParameter));
					break;
				case "hex" : binaryToHexaDecimal(inputArray, inputParameter);
					break;
				default : System.out.println(Constant.INVALID_STRING);
					break;
			}
		}
	}

	public static void binaryToOctal(String[] inputArray, int inputParameter) {
		String inputNumber = inputArray[inputParameter];
		long power = 0;
		long decimalValue = 0;
		for(int i = inputNumber.length() - 1 ; i >= 0 ; i--) {
			int lastDigit = inputNumber.charAt(i) - '0' ; 
			decimalValue = decimalValue + (lastDigit * (long) Math.pow(2, power));
			power++;
		}
		int[] array = new int[100];
		int index = 0;
		while(decimalValue > 0) {
			array[index] = (int) (decimalValue % 8) ;
			decimalValue = decimalValue / 8;
			index++;
		}
		for(int i = index - 1 ; i >= 0 ; i--) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

	public static long binaryToDecimal(String[] inputArray, int inputParameter) {
		String inputNumber = inputArray[inputParameter];
		long power = 0;
		long decimalValue = 0;
		for(int i = inputNumber.length() - 1 ; i >= 0 ; i--) {
			int lastDigit = inputNumber.charAt(i) - '0' ; 
			decimalValue = decimalValue + (lastDigit * (long) Math.pow(2, power));
			power++;
		}
		return decimalValue;
	}

	public static void binaryToHexaDecimal(String[] inputArray, int inputParameter) {
		String inputNumber = inputArray[inputParameter];
		long power = 0;
		long decimalValue = 0;
		for(int i = inputNumber.length() - 1 ; i >= 0 ; i--) {
			int lastDigit = inputNumber.charAt(i) - '0' ; 
			decimalValue = decimalValue + (lastDigit * (int) Math.pow(2, power));
			power++;
		}
		char[] array = new char[100];
		int index = 0;
		char[] array1 = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(decimalValue > 0) {
			int reminder = (int) (decimalValue % 16) ;
			array[index] = array1[reminder];
			decimalValue = decimalValue /16;
			index++;
		}
		for(int i = index - 1 ; i >= 0 ; i--) {
			System.out.print(array[i]);
		}
	}

	public static void octalToOther(String[] inputArray, int inputParameter, int outputNumberSystem) {
		String inputString = inputArray[inputParameter];
		boolean isValidOctal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (ch < '0' || ch > '7') {
				isValidOctal = false;
				break;
			}
		}
		if(!isValidOctal) {
			System.out.println(Constant.NOT_OCTAL);
		}else {
			String outputParameter = inputArray[outputNumberSystem];
			switch(outputParameter) {
				case "bin" : octalToBinary(inputArray, inputParameter);
					break;
				case "oct" : System.out.println(inputString);
					break;
				case "dec" : System.out.println(octalToDecimal(inputArray, inputParameter));
					break;
				case "hex" : octalToHexaDecimal(inputArray, inputParameter);
					break;
				default : System.out.println(Constant.INVALID_STRING);
					break;
			}
		}
	}

	public static void octalToBinary(String[] inputArray, int inputParameter) {
		String inputNumber = inputArray[inputParameter];
		long power = 0;
		long decimalValue = 0;
		for(int i = inputNumber.length() - 1 ; i >= 0 ; i--) {
			int lastDigit = inputNumber.charAt(i) - '0' ; 
			decimalValue = decimalValue + (lastDigit * (int) Math.pow(8, power));
			power++;
		}		
		int[] array = new int[20];
		int index = 0;
		while(decimalValue > 0) {
			array[index] = (int) (decimalValue % 2);
			decimalValue = decimalValue / 2;
			index++;
		}
		for(int i = index - 1 ; i >= 0 ; i--) {
			System.out.print(array[i]);
		}
	}

	public static long octalToDecimal(String[] inputArray, int inputParameter) {
		String inputNumber = inputArray[inputParameter];
		long power = 0;
		long decimalValue = 0;
		for(int i = inputNumber.length() - 1 ; i >= 0 ; i--) {
			int lastDigit = inputNumber.charAt(i) - '0' ; 
			decimalValue = decimalValue + (lastDigit * (int) Math.pow(8, power));
			power++;
		}				
		return decimalValue;
	}

	public static void octalToHexaDecimal(String[] inputArray, int inputParameter) {
		String inputNumber = inputArray[inputParameter];
		long power = 0;
		long decimalValue = 0;
		for(int i = inputNumber.length() - 1 ; i >= 0 ; i--) {
			int lastDigit = inputNumber.charAt(i) - '0' ; 
			decimalValue = decimalValue + (lastDigit * (int) Math.pow(8, power));
			power++;
		}				
		char[] array = new char[20];
		int index = 0;
		char[] array1 = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(decimalValue > 0) {
			int reminder = (int) (decimalValue % 16) ;
			array[index] = array1[reminder];
			decimalValue = decimalValue /16;
			index++;
		}
		for(int i = index - 1 ; i >= 0 ; i--) {
			System.out.print(array[i]);
		}

	}

	public static void decimalToOther(String[] inputArray, int inputParameter, int outputNumberSystem) {
		String inputString = inputArray[inputParameter];
		boolean isValidDecimal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if (ch < '0' || ch > '9') {
				isValidDecimal = false;
				break;
			}
		}
		if(!isValidDecimal) {
			System.out.println(Constant.NOT_DECIMAL);
		}else {
			String outputParameter = inputArray[outputNumberSystem];
			switch(outputParameter) {
				case "bin" : decimalToBinary(inputArray, inputParameter);
					break;
				case "oct" : decimalToOctal(inputArray, inputParameter);
					break;
				case "dec" : System.out.println(inputString);			
					break;
				case "hex" : decimalToHexaDecimal(inputArray, inputParameter);
					break;
				default : System.out.println(Constant.INVALID_STRING);
					break;
			}
		}
	}

	public static void decimalToBinary(String[] inputArray, int inputParameter) {
		String inputNumber = inputArray[inputParameter];
		int num = Integer.parseInt(inputNumber);
		int[] array = new int[100];
		int index = 0;
		while(num > 0) {
			array[index] = num % 2;
			num = num / 2;
			index++;
		}
		for(int i = index - 1 ; i >= 0 ; i--) {
			System.out.print(array[i]);
		}
	}

	public static void decimalToOctal(String[] inputArray, int inputParameter) {
		String inputNumber = inputArray[inputParameter];
		int num = Integer.parseInt(inputNumber);
		int[] array = new int[20];
		int index = 0;
		while(num > 0) {
			array[index] = num % 8 ;
			num = num / 8;
			index++;
		}
		for(int i = index - 1 ; i >= 0 ; i--) {
			System.out.print(array[i]);
		}
	}

	public static void decimalToHexaDecimal(String[] inputArray, int inputParameter) {
		String inputNumber = inputArray[inputParameter];
		int num = Integer.parseInt(inputNumber);
		char[] array = new char[100];
		int index = 0;
		char[] array1 = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(num > 0) {
			int reminder = num % 16 ;
			array[index] = array1[reminder];
			num = num /16;
			index++;
		}
		for(int i = index - 1 ; i >= 0 ; i--) {
			System.out.print(array[i]);
		}
	}

	public static void hexaDecimalToOther(String[] inputArray, int inputParameter, int outputNumberSystem) {
		String inputString = inputArray[inputParameter];
		boolean isValidHexaDecimal = true;
		for (int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if(!((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f'))) {
				isValidHexaDecimal = false;
				break;
			}
		}
		if(!isValidHexaDecimal) {
			System.out.println(Constant.NOT_HEXADECIMAL);
		}else {
			String outputParameter = inputArray[outputNumberSystem];
			switch(outputParameter) {
				case "bin" : hexaDecimalToBinary(inputArray, inputParameter);
					break;
				case "oct" : hexaDecimalToOctal(inputArray, inputParameter);
					break;
				case "dec" : System.out.println(hexaDecimalToDecimal(inputArray, inputParameter));
					break;
				case "hex" : System.out.println(inputString);	
					break;
				default : System.out.println(Constant.INVALID_STRING);
					break;
			}
		}
	}

	public static void hexaDecimalToBinary(String[] inputArray, int inputParameter) {
		String inputNumber = inputArray[inputParameter];
		int decimalValue = 0;
        int base = 1;
        for (int i = inputNumber.length() - 1; i >= 0; i--) {
            char hexCharacter = inputNumber.charAt(i);
            int hexDigit;
			if(hexCharacter >= '0' && hexCharacter <= '9') {
				hexDigit = hexCharacter - '0';
			}
			else if(hexCharacter >= 'A' && hexCharacter <= 'F') {
				hexDigit = hexCharacter - 'A' + 10;
			}
			else {
				hexDigit = hexCharacter - 'a' + 10;
			}
	        decimalValue += hexDigit * base;
	        base *= 16; 
	        }
        int[] array = new int[100];
		int index = 0;
		while(decimalValue > 0) {
			array[index] = decimalValue % 2;
			decimalValue = decimalValue / 2;
			index++;
		}
		for(int i = index - 1 ; i >= 0 ; i--) {
			System.out.print(array[i]);
		}
	}

	public static void hexaDecimalToOctal(String[] inputArray, int inputParameter) {
		String inputNumber = inputArray[inputParameter];
		int decimalValue = 0;
        int base = 1;
        for (int i = inputNumber.length() - 1; i >= 0; i--) {
            char hexCharacter = inputNumber.charAt(i);
            int hexDigit;
			if(hexCharacter >= '0' && hexCharacter <= '9') {
				hexDigit = hexCharacter - '0';
			}
			else if(hexCharacter >= 'A' && hexCharacter <= 'F') {
				hexDigit = hexCharacter - 'A' + 10;
			}
			else {
				hexDigit = hexCharacter - 'a' + 10;
			}
	        decimalValue += hexDigit * base;
	        base *= 16; 
	        }
        int[] array = new int[20];
		int index = 0;
		while(decimalValue > 0) {
			array[index] = decimalValue % 8 ;
			decimalValue = decimalValue / 8;
			index++;
		}
		for(int i = index - 1 ; i >= 0 ; i--) {
			System.out.print(array[i]);
		}
	}

	public static long hexaDecimalToDecimal(String[] inputArray, int inputParameter) {
		String inputNumber = inputArray[inputParameter];
		int decimalValue = 0;
        int base = 1;
        for (int i = inputNumber.length() - 1; i >= 0; i--) {
            char hexCharacter = inputNumber.charAt(i);
            int hexDigit;
			if(hexCharacter >= '0' && hexCharacter <= '9') {
				hexDigit = hexCharacter - '0';
			}
			else if(hexCharacter >= 'A' && hexCharacter <= 'F') {
				hexDigit = hexCharacter - 'A' + 10;
			}
			else {
				hexDigit = hexCharacter - 'a' + 10;
			}
	        decimalValue += hexDigit * base;
	        base *= 16; 
	        }
        return decimalValue;
      	}



}
