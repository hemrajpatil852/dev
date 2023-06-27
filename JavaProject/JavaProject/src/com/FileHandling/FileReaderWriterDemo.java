package com.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderWriterDemo {

	public static void main(String[] args) {
		File f = new File("d:/file_han/WriterReader.txt");
		int x = 0;
		
		try (FileWriter fw = new FileWriter(f)) {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = "";

			while (!(str.equalsIgnoreCase("stop"))) {
				str = br.readLine();

				fw.write(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {

			FileReader fr = new FileReader(f);

			while ((x = fr.read()) != -1) {
				System.out.print((char) x);

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}