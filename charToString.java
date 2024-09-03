package primenumber;
import java.util.*;

public class charToString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}else {
				int a = Character.getNumericValue(str.charAt(i));
				for(int j=1;j<a;j++) {
					System.out.print(str.charAt(i-1));
				}
			}
		}
		sc.close();
	}
}
