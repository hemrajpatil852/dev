package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ResdFile {

	public static void main(String[] args) throws IOException {
		File f = new File("d:/File_han/File2.txt");
		FileInputStream fis = new FileInputStream(f);
		System.out.println(fis.available());
		byte arr[] = new byte[fis.available()];

		int x = fis.read();
		int x1;
		System.out.println((char) x);

		while ((x1 = fis.read()) != -1) {
			System.out.print((char) x1);
		}

		fis.read(arr);
		for (byte b : arr) {
			System.out.print((char) b);
		}

		fis.read(arr, 0, 12);
		for (int i = 0; i < 12; i++) {
			System.out.print((char) arr[i]);
		}

	}

}
