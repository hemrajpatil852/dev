package com.Lab;

import java.util.Arrays;

public class mergetwoarrays {

	public static void main(String[] args) {

		int src1[] = { 10, 20, 30, 40, 50 };
		int src2[] = { 9, 18, 27, 36, 45 };

		int newArray[] = new int[src1.length + src2.length];

		for (int i = 0; i < src1.length; i++) {
			newArray[i] = src1[i];
		}

		for (int i = 0, j = src1.length; j < (src1.length + src2.length); j++, i++) {
			newArray[j] = src2[i];
		}

		System.out.println(Arrays.toString(src1));
		System.out.println(Arrays.toString(src2));
		System.out.println(Arrays.toString(newArray));
	}
}