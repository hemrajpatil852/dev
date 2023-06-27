package com.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		File f = new File("d:/File_han/File2.txt");
		FileOutputStream fos = new FileOutputStream(f);

		fos.write(90);
		String s = "welcome to file handling";
		byte arr[] = s.getBytes();

		fos.write(arr);

		String s2 = "welcome to file handling";

		byte arr1[] = s2.getBytes();
	
		fos.write(arr1, 11, 13);
		System.out.println("file written succesfully");
	}

}
