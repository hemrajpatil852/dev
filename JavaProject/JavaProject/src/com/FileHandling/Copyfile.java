package com.FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copyfile {

	public static void main(String[] args) throws IOException {
		File in = new File("d:/File_han/File.txt");
		
		File out = new File("d:/File_han/File2.txt");

		
		FileInputStream f = new FileInputStream(in);
		
		FileOutputStream fo = new FileOutputStream(out);
		
		int readFile;
		
		while ((readFile=f.read())!=-1) {
			fo.write((char)readFile);
			
		} 
		System.out.println("File copy Sucessfull");
	}

}
