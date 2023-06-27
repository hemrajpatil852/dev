package com.FileHandling;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {

	public static void main(String[] args) {
		try
		{
			File f = new File("d:/file_han/output4.dat");
			int x=65;
			String s="java";
			float f1=67.0f;
			
				f.createNewFile();
				DataOutputStream dout= new DataOutputStream(new FileOutputStream(f));
				
			     dout.writeInt(x);
			     
			     dout.writeUTF(s);
			    
			     dout.writeFloat(f1);
                System.out.println("Data added........");
                dout.close();
				
			
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		


	}

}
}