package com.FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AddingNumbersInFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("d:/file_han/score.txt");
		int x = 0;
		int sum = 0;
		while ((x = fis.read()) != -1) {
			char ch = (char) x;

			if (Character.isDigit(ch)) {
				int a = Character.getNumericValue(ch);
				sum = sum + a;
			}
		}
		System.out.println(sum);
	}

}