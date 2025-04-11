package reverseString;

import java.util.Arrays;

public class reverseString {
	
	public static void main(String[] args) {
		
		char[] palavra = {'H','E','L','L','O'};
		System.out.println(Arrays.toString(reverseStringMetodo(palavra)));
		
		//Se passarem um String
		String testString = "bom dia";
		char[] mudandoString = testString.toCharArray();
		System.out.println(Arrays.toString(reverseStringMetodo(mudandoString)));
	}
	
	public static char[] reverseStringMetodo(char[] letras) {
		
		int l = 0;
		int r = letras.length-1;
		
		while(l<=r) {
			char temp = letras[r];
			letras[r] = letras[l];
			letras[l] = temp;
			l++;
			r--;
		}
		
		return letras;
	}
	
}
