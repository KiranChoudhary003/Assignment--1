package primenumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class stringToChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		String str = sc.next();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> a : map.entrySet()) {
			System.out.print(a.getKey());
			System.out.print(a.getValue());
		}
		sc.close();
	}
}
