package anagram;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String p1 = "art";
		String p2 = "rat";
		System.out.println(anagramMetodo01(p1, p2));
	}
	
	public static boolean anagramMetodo01(String p1, String p2) {
		char[] p1EmChar = p1.toCharArray();
		char[] p2EmChar = p2.toCharArray();;
		Arrays.sort(p1EmChar);
		Arrays.sort(p2EmChar);
		if(Arrays.equals(p1EmChar, p2EmChar)) {
			return true;
		}else {
			return false;
		}
	}
}
