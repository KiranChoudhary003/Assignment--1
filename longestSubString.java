package primenumber;

import java.util.HashSet;
import java.util.Scanner;

public class longestSubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		String s = sc.next();
		
		HashSet<Character> set = new HashSet<>();
		String longest = "";
		String current = "";
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(set.contains(c)) {
				 if (current.length() > longest.length()) {
	                    longest = current;
	                }
				current = "";
				set.clear();
			}
		
			set.add(c);
			current += c;
		}
			
			if(current.length() > longest.length()) {
				current = longest;
			}
			System.out.print(longest.length());
		
			sc.close();
		
	}
}
