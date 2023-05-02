package com.String;

import java.util.Arrays;

public class MaximunFind {

	public static void find(String str) {
		String[] s = str.split(" ");
		String largeWord = s[0];

		System.out.println(Arrays.toString(s));
		for (int i = 0; i < s.length; i++)
			if (s[i].length() > largeWord.length()) {
				largeWord = s[i];
			}
		System.out.println(largeWord);

	}

	public static void main(String[] args) {
		String str = "India is Beautiful Country";
		
		// MaximunFind ob= new MaximunFind();
		MaximunFind.find(str);

	}
}
