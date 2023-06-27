package basic;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		int[] arr = { 12, 45, 54, 78, 11, 7 };
		int sumOfPrimes = calculateSumOfPrimes(arr);
		System.out.println(sumOfPrimes);

	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;

		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;

			}
		}
		return true;

	}

	public static int calculateSumOfPrimes(int[] array) {
		int sum = 0;
		for (int num : array) {
			if (isPrime(num)) {
				sum += num;

			}
		}
		return sum;
	}
}
