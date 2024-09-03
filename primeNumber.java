package primenumber;
import java.util.*;

public class primeNumber {
	public static void main(String[] args) {
		Scanner prime = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = prime.nextInt();
		if(num == 2) {
			System.out.print("Given number is Prime number");
		}else {
		    for(int i=2;i<num;i++) {
			    if(num % i == 0) {
			    	System.out.print("Given number is not Prime number");
			    }
			    else {
			    	System.out.print("Given number is Prime number");
				    break;
			   }
		    }
		}
		prime.close();
	}
}
