package com.FileHandling;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputStreamDemo {

	public static void main(String[] args) {
		try
		{
			File f = new File("d:/file_han/output4.dat");
			
			if(f.exists())
			{
				DataInputStream din = new DataInputStream(new FileInputStream(f));
		
			int x=din.readInt();
			String s=din.readUTF();
			float f1=din.readFloat();
			System.out.print(x+" "+s+" "+f1);
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}