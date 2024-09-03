package numToWord;
import java.util.*;

public class nToW {
	    public static void main(String[] args){
	        Scanner number = new Scanner(System.in);
	        System.out.print("Enter the number : ");
	        int num = number.nextInt();
	        if(num <1 || num >999){
	            System.out.println("Invalid Number");
	            System.out.println("Write the Input from 1 to 999");
	        } else {
	            int a = num % 10;
	            int b = num / 10;
	            int c =  % 10;
	            int d = num /100;
	            String singleDigit[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	            String twentyDigit[] = {"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	            String hundredDigit = "Hundred";
	            if(num < 20) {
	                System.out.println(singleDigit[num]);
	            }else if(num >=20 && num <= 100){
	                System.out.println(twentyDigit[c]+" "+singleDigit[a]);
	            }else{
	                System.out.println(singleDigit[d]+" "+hundredDigit+" "+twentyDigit[c]+" "+singleDigit[a]);
	            }
	        }
	        number.close();
	    }
	

}