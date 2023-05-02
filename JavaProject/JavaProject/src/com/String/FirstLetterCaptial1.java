package com.String;

public class FirstLetterCaptial1 {

private static void dis(String s)
	{
		String [] arr =s.split(" ");
		
		for(int i=0; i<arr.length;i++) {
		
		String str=arr[i];
		String st=" ";
		
		char[] ch=str.toCharArray();
	 for(int j=0; j<arr.length;j++)
	 {
		 if(j==0)
		 {
			 ch[j]=(char)(ch[j]-32);
			 st=st+ch[j];
			 
		 }
		 else
		 {
			 st=st+ch[j];
		 }
	 }
	 System.out.println(st+" ");
		}
	}
	public static void main(String[] args) 
	{

		String s= "java programming";
		FirstLetterCaptial1.dis(s);
	}

}
