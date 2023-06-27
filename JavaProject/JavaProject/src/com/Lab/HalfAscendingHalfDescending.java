package com.Lab;

import java.util.Arrays;

public class HalfAscendingHalfDescending {

	public static void sortHalfAscHalfDesc(int[] arr) 
	{
		int n = arr.length;
		int mid = n / 2;

		Arrays.sort(arr);

		for (int i = mid, j = n - 1; i < j; i++, j--) 
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 9, 1, 7, 2, 8, 4 };
	
		sortHalfAscHalfDesc(arr);
		System.out.println( Arrays.toString(arr));
	}
}
